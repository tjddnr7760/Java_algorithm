// org.junit.jupiter.api분석
//
// 클래스 분석
// - java.lang.**Object**
//     - org.junit.jupiter.api.**AssertionFailureBuilder -** assertion이 실패한 경우 AssertionFailure예외를 생성하고 발생시키는 방법을 제공. 자바로 따지면 예외처리 클래스라고 생각할 수 있음
//     - org.junit.jupiter.api.**Assertions -** 다양한 유형의 테스트를 지원하는 static 메서드
//     - org.junit.jupiter.api.**Assumptions -** 테스트의 조건을 확인하고 검증하여 실행할지 말지 판단하는 메서드
//     - org.junit.jupiter.api.**ClassOrderer.ClassName**
//     - org.junit.jupiter.api.**ClassOrderer.DisplayName**
//     - org.junit.jupiter.api.**ClassOrderer.OrderAnnotation**
//     - org.junit.jupiter.api.**ClassOrderer.Random**
//     - org.junit.jupiter.api.**DisplayNameGenerator.IndicativeSentences**  - display관련 클래스는 전부 동일한 DisplayNameGenerator인터페이스를 상속받았다. 테스트 이름을 자동적으로 생성하여 준다.
//     - org.junit.jupiter.api.**DisplayNameGenerator.Standard**.
//         - org.junit.jupiter.api.**DisplayNameGenerator.Simple**
//             - org.junit.jupiter.api.**DisplayNameGenerator.ReplaceUnderscores**
//     - org.junit.jupiter.api.**DynamicNode** - @TestFactory어노테이션 붙여서 사용할 수 있고, 런타임시 동적으로 생성하고 테스트 할 수 있다
//         - org.junit.jupiter.api.**DynamicContainer**
//         - org.junit.jupiter.api.**DynamicTest**
//     - org.junit.jupiter.api.**MethodOrderer.DisplayName** - MethodOrder클래스는 테스트 메서드를 실행해야 하는 순서를 지정하는 Junit5 라이브러리이다.
//     - org.junit.jupiter.api.**MethodOrderer.MethodName**
//         - org.junit.jupiter.api.**MethodOrderer.Alphanumeric**
//     - org.junit.jupiter.api.**MethodOrderer.OrderAnnotation**
//     - org.junit.jupiter.api.**MethodOrderer.Random**

// 애너테이션 분석
// - org.junit.jupiter.api.**AfterAll** - 이 애너테이션을 붙이면 모든 테스트 메서드가 실행된 후 실행되어야 하는 메서드로 지정됨
// - org.junit.jupiter.api.**AfterEach - 각 테스트 메서드가 실행된 후 실행되는 메서드로 지정됨**
// - org.junit.jupiter.api.**BeforeAll**  - 모든 테스트 메서드가 실행되기 전에 한번 실행되는 메서드로 지정됨
// - org.junit.jupiter.api.**BeforeEach**  - 각 테스트 메서드 실행 전에 한번 실행되는 메서드로 지정됨
// - org.junit.jupiter.api.**Disabled**  - 특정 테스트 코드를 비활성화함
// - org.junit.jupiter.api.**DisplayName** - 테스트 메서드 혹은 테스트 클래스의 이름을 지을 수 있다.
// - org.junit.jupiter.api.**DisplayNameGeneration** - 테스트 메서드 혹은 클래스에 대한 이름을 지을 수 있는 방법을 선택할 수 있다.
// - org.junit.jupiter.api.**IndicativeSentencesGeneration** - 메서드를 기반으로 이름을 생성하는 이름 생산 애너테이션이다.
// - org.junit.jupiter.api.**Nested** - 테스트 코드가 중첩일 경우 생성
// - org.junit.jupiter.api.**Order**  - 테스트 메서드 순서를 지정해서 실행시키는 방법이 있는데 그것을 사용하기 위해 순서를 지정하는데 사용된다.
// - org.junit.jupiter.api.**RepeatedTest** - 테스트 방법이 특정 횟수만큼 반복됨을 지정하게 된다.
// - org.junit.jupiter.api.**Tag**  - 말그대로 태그하여 그룹화 하고 필터링할 때 사용할 수 있다.
// - org.junit.jupiter.api.**Tags** - 여러개의 태그를 붙일때 사용한다.
// - org.junit.jupiter.api.**Test** - 테스트 방법을 지정할 때 사용한다.
// - org.junit.jupiter.api.**TestClassOrder** - 지정된 클래스 순서를 어떻게 처리할지에 관한 애너테이션이다.
// - org.junit.jupiter.api.**TestFactory - 테스트 팩터리 메서드를 지정하는데 사용된다.**
// - org.junit.jupiter.api.**TestInstance - 테스트 클래스의 수명주기를 지정하는데 사용된다.**
// - org.junit.jupiter.api.**TestMethodOrder**  - 지정된 메서드 순서를 어떻게 처리할지에 관한 애너테이션이다.
// - org.junit.jupiter.api.**TestTemplate** - 테스트 템플릿 메서드를 지정하는데 사용된다. 테스트 템플릿 메서드는 서로 다른 매개변수로 여러번 실행되는 메서드이다.
// - org.junit.jupiter.api.**Timeout** - 지정된 시간안에 실행되지 않으면 실패이다.


// Assertions클래스 주요 메서드 정리
// Assertions클래스의 메서드는 전부 static이다.
//
// 1. assertEqulas(expected, actual) - 실제값이 기대값과 같은지 검사한다.
// 2. assertNotEquals(unexpected, actual) - 실제값이 특정값과 같지 않은지 검사한다.
// 3. assertSame(Object expected, Object actual) - 두 객체가 동일한지 검사한다.
// 4. assertNotSame(Object unexpected, Object actual) - 두 객체가 동일하지 않은 객체인지 검사한다.
// 5. assertTrue(boolean condition) - 값이 true인지 검사한다.
// 6. assertFalse(boolean condition) - 값이 false인지 검사한다.
// 7. assertNull(Object actual) - 값이 null 인지 검사한다.
// 8. assertNotNull(Object actual) - 값이 null 이 아닌지 검사한다.
// 9. fail( )  - 테스트를 실패 처리한다.
//
// - 각 메소드마다 타입별로 기능이 존재한다.
// - int형 assertEquals 메서드, Long타입을 위한 assertEquals메서드 등 데이터 타입마다 메서드가 동일한 기능의 메서드가 존재한다.
//
// 1. assertThrows(Class<T> expectedType, Executable executable) - 특정 코드의 블록에 예산된 예외를 throw하는지 테스트 하는데 사용된다. (클래스명, 실행가능한 람다 함수)가 매개변수이다.
// 2. assertDoesNotThrow(Executable executable)
// 3. assertAll( ) - 테스트 실행중에 하나가 실패하면 예외처리되어 뒤의 테스트를 진행하지 못하는경우가 있다.  이럴경우 일단 모든 검증을 진행하고 실패한 것이 있는지 확인하는 assertAll메서드가 있다.

public class AssertionsPrac {
    
}
