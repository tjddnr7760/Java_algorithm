/** 
 *  Work Breakdown Structure in algorithm
 *  
 *  시간복잡도 : O(N^2)
 *  공간복잡도 : O(1)
 *  안정성 : X
 * 
 *  1. Input
 *      한줄마다 숫자가 주어진다
 *      총 다섯줄이 주어진다
 *      주어지는 자연수는 100미만의 10의배수이다
 * 
 *  2. Output
 *      첫째줄에는 평균을 출력한다
 *      둘째줄에는 중앙값을 출력한다
 * 
 *  3. Domain
 *      주어진 자연수들을 저장하는 객체
 * 
 *  4. Controller
 *      5를크기의 배열을 생성한다
 *      값을 입력받는다
 *      값을 배열에 순서대로 저장한다
 *      다섯번을 반복한다
 *      평균을 구한다
 *          1. 배열의 총합을 구한다
 *          2. 5로 나눈다
 *      선택정렬을 구현한다
 *          1. for 문으로 전체 값을 다 확인하면서 최솟값을 기억한다
 *          2. 가장 작은 값을 새로운 배열 첫 인덱스와 교환한다
 *          3. 그 다음 인덱스 부터 전체값을 확인하여 최소값을 구한다
 *          4. 그 다음 인덱스와 교환한다
 *          5. 마지막 까지 작업을 수행한다
 *      출력하는 함수 구현한다
 *      평균을 출력한다
 *      3번째 값을 출력한다
 * 
 *  5. Exception
 *      입력값이 100미만 10의 배수가 아닐 경우
 * 
 */

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

