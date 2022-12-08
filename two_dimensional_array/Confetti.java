/** Work Breakdown Structure
 *  백준 색종이 문제
 * 
 *  1. Input
 *      색종이의 수가 주어진다.
 *      색종이의 왼쪽 아래 꼭짓점 좌표가 주어진다.
 * 
 *  2. Output
 *      색종이의 넓이를 출력한다.
 * 
 *  3. Domain
 *      좌표들을 저장하는 도메인
 * 
 *  4. Controller
 *      색종이 수를 입력받는다.
 *          1. 총 갯수를 입력받는다.
 *          2. 갯수에 해당하는 길이 2의 배열을 생성한다.
 *      색종이 좌표를 입력받는다.
 *          1. 한라인 통채로 읽어서 공백으로 쪼개어 저장한다.
 *          2. 배열 순서대로 저장한다.
 *       색종이 수만큼 입력받는다.
 *          1. 전체 넓이를 구한다.
 *          2. 전체탐색으로 겹치는 부분 있는지 확인한다.
 *          3. 겹치는 부분이 있다면 겹치는 부분 구해서 뺀다.
 *      총 넓이를 출력한다.
 *          1.. 버퍼 라이터로 넓이를 출력한다.
 *  5. Exception
 *      좌표가 유효하지 않은 경우
 *      색종이 수가 유효하지 않은 경우
 * 
 *  --> 현재문제는 인터넷 검색시 100 * 100 크기의 배열을 그대로 만들어서
 *      사각형이 존재하는 부분의 값만을 카운트로 계산해주면 쉽게 해결가능하다.
 * 
 *      본인은 높이와 밑변을 구해서 중복 부분을 빼주는 방법으로 시도했지만
 *      사각형의 위치가 정렬에 한계가 있어 경우의 수를 추가해주어야 한다.
 *      x축은 정렬을 해주고, y축은 위에 왼쪽 사각형 보다 위에 있냐 아래에 있냐로 구분하여 겹치는 부분의 넓이를
 *      구하는 것 까지는 성공하였지만
 *      3개가 겹쳤을때는 중복되어 겹쳐진 부분을 다시 더해주어야 하기는 로직을 추가해주어야한다.
 *      4,5,6...100개가 겹쳤을 경우도 생각하여야 한다.
 *      
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.IOException;
import java.util.Arrays;

public class Confetti{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Confetti(){
    }
    
    public static void main(String[] args) throws IOException {
        Confetti main = new Confetti();
        int total = main.setTotal();
        
        int[][] coordinates = new int[total][2];
        main.setCoordinate(coordinates);
        
        int answer = main.overlap(coordinates);
        main.outputAnswer(answer);
    }
    
    public void outputAnswer(int answer) throws IOException {
        writer.write(Integer.toString(answer));
        writer.flush();
        writer.close();
    }
    
    public int setTotal() throws IOException {
        int total = 0;
        total = Integer.parseInt(reader.readLine());

        return total;
    }
    
    public void setCoordinate(int[][] coordinates) throws IOException {
        for (int procedure = 0; procedure < coordinates.length; procedure++) {
            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < 2; i++) {
                coordinates[procedure][i] = Integer.parseInt(line[i]);    
            }     
        }
        Arrays.sort(coordinates, Comparator.comparingInt((int[] o) -> o[0]));
    }
    
    public int overlap(int[][] coordinates) {
        Confetti main = new Confetti();
        int allSize = 0;
        for (int procedure = 0; procedure < coordinates.length; procedure++) {
            allSize += main.checkEachConfetti(procedure, coordinates);
        }
        allSize = (coordinates.length * 100) - allSize;
        return allSize;
    }
    
    public int checkEachConfetti(int procedure, int[][] coordinates) {
        Confetti main = new Confetti();
        int overlap = 0;
        
        for (int compare = procedure + 1; compare < coordinates.length; compare++) {
            if(main.isOverlap(coordinates[procedure], coordinates[compare])) {
                overlap += main.overlapSize(coordinates[procedure], coordinates[compare]);
            }
        }
        return overlap;
    }
    
    public int overlapSize(int[] coordinateA, int[] coordinateB) {
        int width = 0;  
        int vertical = 0;
        
        if(coordinateA[1] > coordinateB[1]) {
            width = coordinateA[0] + 10 - coordinateB[0];
            vertical = coordinateB[1] + 10 - coordinateA[1];
        }
        
        if(coordinateA[1] <= coordinateB[1]) {
            width = coordinateA[0] + 10 - coordinateB[0];
            vertical = coordinateA[1] + 10 - coordinateB[1];
        }
        
        int size = width * vertical;
        return size;
    }
    
    public boolean isOverlap(int[] coordinateA, int[] coordinateB) {
        boolean result = false;
        if(coordinateA[1] > coordinateB[1]) {
            if ((coordinateB[0] + 10) - coordinateA[0] < 20 &&
                (coordinateA[1] + 10) - coordinateB[1] < 20) {
                result = true;
            }
        }

        if(coordinateA[1] <= coordinateB[1]) {
            if ((coordinateB[0] + 10) - coordinateA[0] < 20 &&
                (coordinateB[1] + 10) - coordinateA[1] < 20) {
                result = true;
            }
        }
        return result;
    }
}
