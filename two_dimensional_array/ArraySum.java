import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ArraySum{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    ArraySum(){
    }
    
    public static void main(String[] args) throws IOException {
        ArraySum main = new ArraySum();
        int[][] firstMatrix = main.generateMatrix();
        int[][] secondMatrix = new int[firstMatrix.length][firstMatrix[0].length];
        
        firstMatrix = main.putValueInMatrix(firstMatrix);
        secondMatrix = main.putValueInMatrix(secondMatrix);
        
        firstMatrix = main.addTwoMatrix(firstMatrix, secondMatrix);
        main.outputAnswers(firstMatrix);
    }
    
    public int[][] generateMatrix() throws IOException {
        String[] sizes = reader.readLine().split(" ");
        int row = Integer.parseInt(sizes[0]);
        int column = Integer.parseInt(sizes[1]);
        
        int[][] matrixes = new int[row][column];
        return matrixes;
    }
    
    public int[][] putValueInMatrix(int[][] matrixes) throws IOException {
        for (int level = 0; level < matrixes.length; level++) {
            String[] rowElements = reader.readLine().split(" ");
            for (int i = 0; i < matrixes[0].length; i++) {
                matrixes[level][i] = Integer.parseInt(rowElements[i]);
            }
        }
        return matrixes;
    }
    
    public int[][] addTwoMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        for (int level = 0; level < firstMatrix.length; level++) {
            for (int i = 0; i < firstMatrix[0].length; i++) {
                firstMatrix[level][i] += secondMatrix[level][i]; 
            }
        }
        return firstMatrix;
    }
    
    public void outputAnswers(int[][] firstMatrix) throws IOException {
        for (int level = 0; level < firstMatrix.length; level++) {
            for (int i = 0; i < firstMatrix[0].length; i++) {
                writer.write(Integer.toString(firstMatrix[level][i]) + " ");
            }
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}