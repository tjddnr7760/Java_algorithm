public class JavaVariables {
    // 클래스 변수
    public static int point = 0;
    
    // 인스턴스 변수, 인스턴스 변수는 초기화 되지 않고 기본적으로 null값을 가지고,
    // 기본유형 int나 float, double같은 유형은 0을 가진다.
    private int size = 0;
    private String name = "";
    
    public void doingSomething() {
        // 지역변수, 지역변수는 블록이나 메서드 내에서만 사용되고 사라지기 때문에
        // 따로 public, protected, private같은 접근 권한이 없이 그냥 사용해 주면 된다.
        int local = 0;
        String localName = "abc";

        // doing something...
    }
    
    // 매개 변수
    public int doingSomething2(int a, int b) {
        return a + b;
    }

    // 배열 변수
    int[] arrayvariable = new int[5];

    enum Day {
        // 열거형 변수
        SUNDAY, MONDAY, TUESDAY, FRIDAY
    }

    // 최종 변수
    public final int length = 10;
}
