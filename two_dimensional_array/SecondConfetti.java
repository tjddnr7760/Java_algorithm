/** Work Breakdown Structure
* 
*  1. Input
* 
* 
*  2. Output
* 
* 
*  3. Domain
* 
* 
*  4. Controller
*      처음 풀었던 Confetti클래스의 문제가 너무 많은 경우의 수 로 인해서
*      해답지를 찾아보고 암기하는 형태의 오답지입니다.
*      종이가 3장, 4장 겹쳐지는 경우 더하고 빼는 로직이 달라지고 겹치는 공간의
*      넓이를 확인하는 것이 비효율적이라고 판단하였습니다.
* 
*      1. 색종이 갯수를 입력받는다.
*      2. 100 * 100 크기의 2차원 배열을 만든다.
*      3. 배열의 값을 flase로 전부 초기화 한다. 
*      4. 좌표를 입력받는다.
*      5. 좌표의 위치에 맞게 2차원 배열의 값을 true로 바꾸는 함수를 만든다.
*      6. 이미 true인 값은 바꾸지 않는다.
*      7. 좌표값을 전부 입력한다.
*      8. 하나의 true값을 넓이 1로 보고 전체 true갯수를 구한다.
*      9. 출력한다.
*      
*  5. Exception
* 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class SecondConfetti{
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    SecondConfetti(){
    }

    public static void main(String[] args) throws IOException {
        SecondConfetti secondconfetti = new SecondConfetti();
        int total = secondconfetti.setTotal();

        boolean[][] fullPaper = new boolean[101][101];
        secondconfetti.initPaper(fullPaper);
        secondconfetti.inputAllCases(total, fullPaper);

        int size = secondconfetti.countSize(fullPaper);
        secondconfetti.outputResult(size);
    }

    public void outputResult(int size) throws IOException {
        writer.write(Integer.toString(size));
        writer.flush();
        writer.close();
    }

    public int countSize(boolean[][] fullPaper) {
        int count = 0;
        for(int row = 1; row <= 100; row++) {
            count += countColumn(fullPaper, row);
        }
        return count;
    }

    public int countColumn(boolean[][] fullPaper, int row) {
        int count = 0;
        for(int column = 1; column <= 100; column++) {
            if(fullPaper[row][column] == true) {
                count++;
            }
        }
        return count;
    }

    public void inputAllCases(int total, boolean[][] fullPaper) throws IOException {
        for(int i = 0; i < total; i++) {
            inputCoordinate(fullPaper);
        }
    }

    public int setTotal() throws IOException {
        int total = Integer.parseInt(reader.readLine());
        return total;
    }

    public void initPaper(boolean[][] fullPaper) {
        for(int row = 1; row <= 100; row++) {
            for(int column = 1; column <= 100; column++) {
                fullPaper[row][column] = false;
            }
        }
    }

    public void inputCoordinate(boolean[][] fullPaper) throws IOException {
        String[] coordinatesline = reader.readLine().split(" ");
        int coordinateX = Integer.parseInt(coordinatesline[0]);
        int coordinateY = Integer.parseInt(coordinatesline[1]);

        tintPaper(fullPaper, coordinateX, coordinateY);
    }

    public void tintPaper(boolean[][] fullPaper, int x, int y) {
        for(int row = 1; row <= 100; row++) {
            tintPaperColumn(fullPaper, row, x, y);
        }
    }

    public void tintPaperColumn(boolean[][] fullPaper, int row, int x, int y) {
        for(int column = 1; column <= 100; column++) {
            if(compareRow(row, y) && compareColumn(column, x)) {
                fullPaper[row][column] = true;
            }
        }
    }

    public boolean compareRow(int row, int y) {
        boolean result = false;
        if((row >= y && row < y + 10)) {
            result = true;
        }
        return result;
    }

    public boolean compareColumn(int column, int x) {
        boolean result = false;
        if((column >= x && column < x + 10)) {
            result = true;
        }
        return result;
    }
}