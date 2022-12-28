import java.io.IOException;
import java.io.InputStream;

public class MinmizeLocalVariable {
    // try-with-resources
    // 자동으로 닫혀야 하는 리소스만 소괄호안에서 선언할 수 있으며
    // catch후에 자동으로 리소스를 닫아주기 때문에 finally에서
    // 처리할 필요가 없고 에러 처리도 다 한번에 한다.
    public void doingSomething3() {
        // try with resources 예시
        // 괄호 안에 리소스 선언하면 자동으로 닫아준다.
        try (InputStream input = new InputStream()) {
            input.read();
        } catch (Exception e) {
            System.out.print(e);
        }

        // 일반 try문 예시
        // 자동으로 닫아주지 않기 때문에 마지막에 한번더 
        // try문을 사용해야 한다.
        InputStream input2;
        try {
            input2 = new InputStream();
        } catch (IOException e) {

        } finally {
            try {
                input2.close();
            } catch (IOException e) {

            }
        }
    }

    //람다 표현


    //for과 iterator
}
