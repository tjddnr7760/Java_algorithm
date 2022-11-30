import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Count{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Count main = new Count();
        
        int volume = Integer.parseInt(reader.readLine());
        
        String[] letterCells = reader.readLine().split(" ");
        int[] numberCells = main.getVolumeCells(letterCells);
        
        int v = Integer.parseInt(reader.readLine());
        String answer = main.vCorrect(v, numberCells);
        
        writer.write(answer);
        writer.flush();
    }
    
    public int[] getVolumeCells(String[] letterCells) {
        int[] numberCells = new int[letterCells.length];
        
        for(int i = 0; i < letterCells.length; i++) {
            numberCells[i] = Integer.parseInt(letterCells[i]);
        }
        
        return numberCells;
    }
    
    public String vCorrect(int v, int[] numberCells) {
        int count = 0;
        
        for(int i = 0; i < numberCells.length; i++) {
            if(numberCells[i] == v) {
                count++;
            }
        }
        
        String answer = Integer.toString(count);
        return answer;
    }
}
