import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.Math;
import java.util.Comparator;
import java.io.IOException;
import java.util.Arrays;

public class Confetti{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Confetti(){
    }
    
    public static void main(String[] args) throws IOException {
        Confetti main = new Confetti();
        int total = main.setTotal();
        
        int[][] coordinates = new int[total][2];
        main.setCoordinate(coordinates);
        
        int answer = main.overlap(coordinates);
        main.outputAnswer(answer);
    }
    
    public void outputAnswer(int answer) throws IOException {
        writer.write(Integer.toString(answer));
        writer.flush();
        writer.close();
    }
    
    public int setTotal() throws IOException {
        int total = 0;
        total = Integer.parseInt(reader.readLine());

        return total;
    }
    
    public void setCoordinate(int[][] coordinates) throws IOException {
        for (int procedure = 0; procedure < coordinates.length; procedure++) {
            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < 2; i++) {
                coordinates[procedure][i] = Integer.parseInt(line[i]);    
            }     
        }
        Arrays.sort(coordinates, Comparator.comparingInt((int[] o) -> o[0]));
    }
    
    public int overlap(int[][] coordinates) {
        Confetti main = new Confetti();
        int allSize = 0;
        for (int procedure = 0; procedure < coordinates.length; procedure++) {
            allSize += main.checkEachConfetti(procedure, coordinates);
        }
        allSize = (coordinates.length * 100) - allSize;
        return allSize;
    }
    
    public int checkEachConfetti(int procedure, int[][] coordinates) {
        Confetti main = new Confetti();
        int overlap = 0;
        
        for (int compare = procedure + 1; compare < coordinates.length; compare++) {
            if(main.isOverlap(coordinates[procedure], coordinates[compare])) {
                overlap = main.overlapSize(coordinates[procedure], coordinates[compare]);
            }
        }
        return overlap;
    }
    
    public int overlapSize(int[] coordinateA, int[] coordinateB) {
        int width = coordinateA[0] + 10 - coordinateB[0];  
        int vertical = coordinateB[1] + 10 - coordinateA[1];
        
        int size = width * vertical;
        size = Math.abs(size);
        return size;
    }
    
    public boolean isOverlap(int[] coordinateA, int[] coordinateB) {
        boolean result = false;
        
        if ((coordinateB[0] + 10) - coordinateA[0] < 20 &&
                (coordinateB[1] + 10) - coordinateA[1] < 20) {
            result = true;
        }
        return result;
    }
}
