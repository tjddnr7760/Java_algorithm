/** Work BreackDown Structure in algorithm
 * 
 *  1. Input
 *      한 줄씩 제출한 사람 번호가 입력된다.
 * 
 *  2. Output
 *      제출하지 않은 번호 중 작은수 1
 *      제출하지 않은 번호 중 큰수 1
 * 
 *  3. Domain
 *      28개의 숫자를 저장
 * 
 *  4. Controller
 *      1. 숫자를 입력 받는다 - BuffereReader -> String - > Integer 캐스팅
 *      2. ArrayList<Integer> 로 입력받는다.
 *      3. 1 ~ 30까지 for문으로 돌면서 없는 숫자 정답 리스트에 푸쉬한다.
 *      4. 정답 리스트를 정렬한다.
 *      5. 정답을 출력한다. 
 *  
 *  5. Exception
 *      숫자 입력이 28개가 아닌경우
 *      숫자가 1 <= n <= 30 을 벗어나는 경우
 *      자연수가 아닌 경우
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.ArrayList;

public class Subject{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Subject(){
    }

    public static void main(String[] args) throws IOException {
        Subject main = new Subject();
        ArrayList<Integer> attendStudents = new ArrayList<>();
        ArrayList<Integer> absentStudents = new ArrayList<>();
        
        attendStudents = main.inputStudents(attendStudents);
        absentStudents = main.compareAbsent(attendStudents, absentStudents);
        absentStudents = main.sort(absentStudents);
        main.outputAnswer(absentStudents);
    }
    
    public ArrayList<Integer> inputStudents(ArrayList<Integer> attendStudents) throws IOException {
        for (int i = 0; i < 28; i++) {
            int attendNum = Integer.parseInt(reader.readLine());
            attendStudents.add(attendNum);
        }
        
        return attendStudents;
    }
    
    public ArrayList<Integer> compareAbsent(ArrayList<Integer> attendStudents, ArrayList<Integer> absentStudents) {
        for(int i = 1; i <= 30; i++) {
            if(attendStudents.contains(i) == false) {
                absentStudents.add(i);
            }
        }
        
        return absentStudents;
    }
    
    public ArrayList<Integer> sort(ArrayList<Integer> absentStudents) {
        Collections.sort(absentStudents);
        
        return absentStudents;
    }
    
    public void outputAnswer(ArrayList<Integer> absentStudents) throws IOException {
        String firstAnswer = Integer.toString(absentStudents.get(0));
        String secondAnswer = Integer.toString(absentStudents.get(1));
        
        writer.write(firstAnswer + "\n");
        writer.write(secondAnswer);
        writer.flush();
    }
}
