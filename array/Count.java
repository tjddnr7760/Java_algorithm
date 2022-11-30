/** 1차원 배열 - 개수 세기
 *  질문. 어떤 변수명이 좋은 변수명인가?
 *  -> cs2199.tistory.com/3
 * 
 *  질문. 함수 사용시 static사용을 해야하는가?
 *  -> 객체지향적이지 못하고 인터페이스 구현시 사용될 수 없기때문에 지양한다.
 * 
 *  질문. 버퍼리더를 꼭 사용해야하는가?
 *  -> 버퍼를 사용해 메모리를 절약할 수 있음으로 사용한다.
 * 
 *  질문. 함수를 얼마나 쪼개어야 하는가?
 *  -> 하나의 함수는 한가지 기능만 한다. 함수가 15라인이 넘어가지 않게 연습한다.
 * 
 *  질문. main함수는 얼마나 두꺼울 수 있는가?
 *  -> main함수도 함수임으로 15라인이 넘어가지 않게 한다. 
 *  메인 함수는 입출력 기능, 핵심 기능만 구현하고 함수로 분리한다.
 * 
 *  질문. 함수안에서 공백은 어디서 써야 하는가?
 *  -> 깃허브 오픈소스 참고 결과, 사람들마다 다르지만 읽기 편하게 공백을 추가하면 될 것 같다. 
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Count{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Count count = new Count();

        Integer.parseInt(reader.readLine());
        int[] cells = count.castToNumber(reader, count);
        int v = Integer.parseInt(reader.readLine());
        String answer = count.matchWithV(v, cells);

        writer.write(answer);
        writer.flush();
    }
    
    public int[] castToNumber(BufferedReader reader, Count count) throws IOException {
        String[] lettercells = reader.readLine().split(" ");
        
        return count.getNumCells(lettercells);
    }
    
    public int[] getNumCells(String[] letterCells) {
        int[] cells = new int[letterCells.length];
        
        for(int i = 0; i < letterCells.length; i++) {
            cells[i] = Integer.parseInt(letterCells[i]);
        }
        
        return cells;
    }
    
    public String matchWithV(int v, int[] cells) {
        int count = 0;
        
        for(int i = 0; i < cells.length; i++) {
            if(cells[i] == v) {
                count++;
            }
        }
        String answer = Integer.toString(count);
        
        return answer;
    }
}
