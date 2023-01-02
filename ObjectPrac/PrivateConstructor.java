//생성자를 private로 선언하여 
//외부에서 instance를 함부로 생성하지 못하도록 한다.

public class PrivateConstructor {
    private static PrivateConstructor instance;

    private PrivateConstructor() {

    }

    public static PrivateConstructor getConstructor() {
        if(instance== null) {
            instance = new PrivateConstructor();
        }
        return instance;
    }
}
