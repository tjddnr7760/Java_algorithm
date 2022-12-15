import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class SelectSorting{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    SelectSorting() {
        
    }
    
    public static void main(String[] args) throws IOException {
        SelectSorting main = new SelectSorting();
        int[] numbers = new int[5];
        
        main.scan(numbers);
        main.selectSorting(numbers);
        main.printAnswers(numbers);
    }
    
    public void scan(int[] numbers) throws IOException {
        for(int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
    }
    
    public void average(int[] numbers) throws IOException {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        int averagenum = sum / 5;
        printValue(averagenum);
    }
    
    public void printValue(int num) throws IOException {
        writer.write(Integer.toString(num) + "\n");
        writer.flush();
    }
    
    public void selectSorting(int[] numbers) {
        int length = numbers.length;
        int min = 0;
        
        for(int i = 0; i < length - 1; i++) {
            min = findMin(i, numbers);
            swap(i, min, numbers);
        }
    }
    
    public int findMin(int index, int[] numbers) {
        int min = numbers[index];
        for ( ; index < numbers.length; index++) {
            if(min < numbers[index]) {
                min = numbers[index];
            }
        }
        return min;
    }
    
    public void swap(int index, int min, int[] numbers) {
        int copy = numbers[index];
        numbers[index] = min;
        
        int minindex = findIndex(index, min, numbers);
        numbers[minindex] = copy;
    }
    
    public int findIndex(int index, int number, int[] numbers) {
        int findindex = 0;
        for ( ; index < numbers.length; index++) {
            if(numbers[index] == number) {
                findindex = index;
            }
        }
        return findindex;
    }
    
    public void printAnswers(int[] numbers) throws IOException {
        average(numbers);
        printValue(numbers[2]);
        reader.close();
    }
}

