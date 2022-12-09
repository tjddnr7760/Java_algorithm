/**
 *  Work Breakdown Structure in algorithm
 * 
 *  시간복잡도 : for문을 두번 중첩하였고 버블소트 사용하였기 때문에 O(N^2)
 *  공간복잡도 : 변수만 몇개 추가하는게 일정하게 유지됨으로 O(1)
 * 
 *  1. Input
 *      총 입력받을 수의 갯수를 입력받는다
 *      수를 입력받는다
 *      절대값이 100보다 작거나 같은 정수이다
 * 
 *  2. Output
 *      입력받은 수를 오름차순으로 한라인씩 출력한다
 * 
 *  3. Domain
 *      입력받은 수를 저장하는 클래스
 * 
 *  4. Controller
 *      총 숫자를 입력받는다
 *      총숫자 크기의 배열을 생성한다
 *      총 숫자만큼 for문을 돌면서 배열에 입력받는다
 *      정렬 알고리즘을 생성한다
 *          버블소트로 구현한다
 *              1. 가장왼쪽 인덱스 부터 큰값을 오른쪽으로 스왑한다
 *              2. 오른쪽 끝까지 순환한다
 *              3. 맨마지막 인덱스를 제외하고 동일하게 순환한다
 *              4. 첫번째 인덱스 까지 순환한다
 *      출력 알고리즘을 생성한다
 *          1. 배열 순서대로 출력한다
 * 
 *  5. Exception
 *      입력 범위내에 있지 않은 값이 입력되면 예외처리한다 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class NumberSorting {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    NumberSorting() {
    }

    public static void main(String[] args) throws IOException {
        NumberSorting main = new NumberSorting();
        int[] numbers = main.setNumbers();
        main.inputNumbers(numbers);
        main.bubbleSort(numbers);
        main.printResult(numbers);
    }

    public int[] setNumbers() throws IOException {
        int size = Integer.parseInt(reader.readLine());
        int[] numbers = new int[size];
        return numbers;
    }

    public void inputNumbers(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
    }

    public void bubbleSort(int[] numbers) {
        int length = numbers.length;
        for (int times = 1; times < length; times++) {
            for (int index = 0; index < length - times; index++) {
                swap(numbers, index);
            }
        }
    }

    public void swap(int[] numbers, int index) {
        if (numbers[index] > numbers[index + 1]) {
            int value = numbers[index + 1];
            numbers[index + 1] = numbers[index];
            numbers[index] = value;
        }
    }

    public void printResult(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            writer.write(Integer.toString(numbers[i]) + "\n");
        }
        writer.flush();
        writer.close();
    }
}
