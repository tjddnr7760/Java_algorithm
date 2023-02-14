import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.Arrays;
import java.util.Collections;

import java.io.IOException;

public class QuickSort {
    public static void main(String[] args) throws IOException {

        QuickSort prac = new QuickSort();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = reader.readLine();
        String input2 = reader.readLine();

        int[] standards = Arrays.stream(input1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] scores = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        scores = prac.quickSort(scores);
        int answer = prac.printResult(standards, scores);

        writer.write(String.valueOf(answer));
        writer.flush();
    }

    public int[] quickSort(int[] array) {
        Integer[] intArr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());

        return Arrays.stream(intArr).mapToInt(Integer::intValue).toArray();
    }

    public int printResult(int[] standards, int[] scores) {
        int answer = scores[standards[1] - 1];
        return answer;
    }
}