/** Work Breakdown Structure 정리
 * 
 *  1. Input
 *      9 x 9 크기의 행렬이 있다
 *      한줄에 스페이스 구분으로 9개의 값이 들어있다
 *      총 9라인이 존재한다
 * 
 *  2. Output
 *      최대값을 출력한다
 *      최대값의 행과 열을 출력한다
 * 
 *  3. Domain
 *      행렬의 값을 저장하는 도메인
 * 
 *  4. Controller
 *      9 x 9크기의 2차원 배열을 생성한다 
 *          1. 크기 고정 배열 한개 생성한다
 *      행렬을 한 라인씩 입력받는다
 *          1. 스페이스 기준으로 분리한다
 *          2. 문자열 타입 정수형 타입으로 변환한다
 *          3. 행렬 라인 하나씩 입력한다
 *      가장 큰 원소값을 전체탐색하여 찾는다
 *          1. for문으로 전체 탐색하면서 가장큰값 저장한다
 *          2. 각각의 index 도 저장한다
 *      값과 위치를 출력한다
 *          1. 저장된 최댓값 출력한다
 *          2. "\n" 출력한다
 *          3. 행, 열 출력한다
 * 
 *  5. Exception
 *      행렬 내부값의 범위가 0 <= n <= 90 이 아니라면 예외처리한다
 *      범위내에 정수가 아니라면 예외처리한다
 *      숫자가 81개가 아니라면 예외처리한다
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Maxvalue{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Maxvalue(){
    }
    
    public static void main(String[] args) throws IOException {
        Maxvalue main = new Maxvalue();
        
        int[][] matrix = new int[9][9];
        main.inputValues(matrix);
        int[] answers = main.compareElements(matrix);
        main.printAnswers(answers);
    }
    
    public void inputValues(int[][] matrix) throws IOException {
        for (int layer = 0; layer < 9; layer++) {
            String[] line = reader.readLine().split(" ");
            for (int e = 0; e < 9; e++) {
                matrix[layer][e] = Integer.parseInt(line[e]);
            }
        }
    }
    
    public int[] compareElements(int[][] matrix) {
        Maxvalue main = new Maxvalue();
        int[] answers = new int[3];
        answers[0] = matrix[0][0];
        answers[1] = 0;
        answers[2] = 0;
        
        for (int layer = 0; layer < 9; layer++) {
            answers = main.findMax(matrix, answers, layer);
        }
        return answers;
    }
    
    public int[] findMax(int[][] matrix, int[] answers, int layer) {
        for (int e = 0; e < 9; e++) {
            if (matrix[layer][e] > answers[0]) {
                answers[0] = matrix[layer][e];
                answers[1] = layer + 1;
                answers[2] = e + 1;
            }
        }
        return answers;
    }
    
    public void printAnswers(int[] answers) throws IOException {
        writer.write(Integer.toString(answers[0]) + "\n");
        writer.write(Integer.toString(answers[1]) + " " + Integer.toString(answers[2]));
        
        writer.flush();
        writer.close();
    }
}
