import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import java.io.IOException;

public class Baekjoon10989 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {

        Baekjoon10989 main = new Baekjoon10989();

        int count = Integer.parseInt(reader.readLine());
        int[] numbers = new int[count];
        
        numbers = main.insertValues(numbers);
        numbers = main.quickSort(numbers);
        main.printResult(numbers);
    }

    public int[] insertValues(int[] numbers) throws IOException {
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        
        return numbers;
    }

    public int[] quickSort(int[] numbers) {

        Arrays.sort(numbers);
        return numbers;
    }

    public void printResult(int[] numbers) throws IOException {

        for (int e : numbers) {
           writer.write(String.valueOf(e) + "\n"); 
        }

        writer.flush();
        writer.close();
    }
}
