//자바 기본타입, 박싱타입 정리

public class BoxingType {
    //기본타입
    // boolean
    // char 
    // byte 
    // short 
    // int 
    // long
    // float
    // double

    //박싱 타입
    // Boolean
    // Character
    // Byte
    // Short
    // Integer
    // Long
    // Float
    // Double

    //기본 타입 -> 박싱 타입 래핑하는 법
    //박싱명.valueOf()
    Integer wrapperInt = Integer.valueOf(5);

    //박싱타입 -> 기본타입 변환
    //박싱명.intValue();
    int primitiveInt = wrapperInt.intValue();

    //자동 박싱되는 경우도 있고
    int a = 1;
    Object obj = a;
    //자동으로 언박싱 되는 경우도 있다.
    Object obj2 = 1;
    int b = (int)obj2;

    //기본타입과 박싱타입의 연산도 다르고 헷깔릴 수 
    //있으니 잘 구분하여 사용하도록 한다.
}
