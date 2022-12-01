/** Work Breakdown Structure in algorithm
 *  백준 행렬 덧셈 문제 
 * 
 *  1. Input
 *      행렬의 사이즈가 입력된다
 *      각 행렬의 요소가 입력된다
 *  
 *  2. Output
 *      행렬의 합을 출력한다
 * 
 *  3. Domain
 *      행렬의 요소를 저장할 Matrix클래스
 * 
 *  4. Controller
 *      행렬의 사이즈를 입력받는다
 *          1. 한줄 전체를 입력받는다
 *          2. 스페이스를 기준으로 크기를 저장한다
 *          3. 행렬의 총 크기를 구한다.
 *          4. 총 크기에 해당하는 2차원배열을 생성한다
 *      각 행렬의 값을 입력받는다
 *          1. 한줄 전체를 입력받는다
 *          2. 스페이스를 기준으로 쪼개어 하나의 값씩 2차원 배열에 순서대로 저장한다
 *          3. 행렬은 두개임으로 행 * 2 횟수만큼 반복한다
 *      행렬을 더한다
 *          1. 첫번째 2차원 배열과 두번째 2차원 배열을 더한다
 *      행렬을 출력한다
 *          1. 열의 갯수마다 \n을 넣어서 출력한다 
 *  
 *  5. Exception
 *      행렬의 사이즈가 유효하지 않은 경우
 *      행렬의 사이즈와 맞지 않는 값을 입력하였을 경우
 *      원소의 값이 -100 <= x <= 100이 아닐 경우    
 */

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