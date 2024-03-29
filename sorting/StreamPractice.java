/**
 *  Stream 개념
 *      JAVA8에서 추가됨
 *      다양한 데이터들을 표준화된 방법으로 다룰수 있다
 *      컬렉션을 통해 관리하는 데이터를 처리하는데 사용할 수 있다
 *      다양한 데이터를 간결하고 가독성있게 처리할 수 있다
 *      람다를 사용할 줄 알아야 한다
 * 
 *      Stream API 최상위 인터페이스는 BaseStream 인터페이스이다
 *      Stream은 인터페이스로 각 컬렉션 별로 상속하여 재정의되어져 있어 사용할 수 있다
 *      
 *      - 스트림 생성 방식
 *          1. 컬렉션 객체에서 stream()호출하여 생성
 *          2. 스트림 빌더를 사용하여 생성
 *              스트림을 생성하고 가공하여 사용이 끝나면 종료되어 스트림은 재활용할 수 없다
 *          
 *      - 스트림의 연산
 *          각 연산의 연결을 통해서 파이프라인을 구성할 수 있다
 *          다양한 연산을 조합할 수 있다
 *          객체 생성 -> 중간 연산 -> 최종 연산
 *          
 *      - 중간연산
 *          반환타입이 스트림이기 때문에 체이닝을 통해서 계속 연산할 수 있다
 *          1. filter
 *          2. map
 *          3. limit
 *          4. sorted
 *          5. distinct
 *          6. peek
 *          7. skip
 *  
 *      - 최종연산
 *          가공된 스트림을 최종연산을 통해 각 요소의 결과를 출력한다
 *          최종연산이 끝나면 스트림이 닫히고 재사용이 불가능하다
 *          1. forEach
 *          2. count
 *          3. collect
 *          4. sum
 *          5. reduce
 *
 * 
 *      - 인터페이스 트리
 *          java.lang.AutoCloseable 자동으로 닫을 수 있게 해줌
                java.util.stream.BaseStream<T,​S> 기본적인 스트림 메소드 기능 정의
                    java.util.stream.DoubleStream 더블 원소들 스트림 사용 할 때
                    java.util.stream.IntStream  인트 원소들 스트림 사용 할 때
                    java.util.stream.LongStream  롱인트 원소들 스트림 사용 할 때
                    java.util.stream.Stream<T>  다양한 타입들 스트림 사용 할 때
            java.util.stream.Collector<T,​A,​R> 스트림의 요소들을 모아서 결과를 만들어 내는 메소드를 제공한다. 
            java.util.function.Consumer<T> 입력값을 소비하는 메소드 accept를 가지고 있다
                    java.util.stream.Stream.Builder<T>
            java.util.function.DoubleConsumer
                    java.util.stream.DoubleStream.Builder
            java.util.function.IntConsumer
                    java.util.stream.IntStream.Builder
            java.util.function.LongConsumer
                    java.util.stream.LongStream.Builder
 * 
 *      
 *      - BaseStream<T, S> 메소드 분석
 *              1. boolean isParallel() - 현재 스트림이 병렬로 처리 되는지 여부를 나타낸다.
 *              2. Iterator<T> iterator() - 이터레이터를 반환하여 스트림의 요소들을 하나씩 접근할 수 있게 해준다.
 *              3. S onClose() - 스트림을 닫을때 사용한다. 스트림이 닫힐때 자동으로 호출된다.BaseStream 인터페이스를 상속해서 재정의할 수 있다.
 *              4. S parallel() - 스트림의 메소드를 병렬로 처리할 수 있도록 하는 메소드
 *              5. S sequential() -
 *              6. Spliterator<T> spliterator() -
 *              7. S unordered() -
 *      
 */

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPractice {
    //스트림 객체 생성방법
    //1. 컬렉션에서 바로 스트림 객체를 호출하는 stream() 를 호출한다
    List<String> list = Arrays.asList("a", "b", "c", "d");
    Stream<String> stream = list.stream();

    //2. 스트림 빌더
    //데이터가 모여있지 않은 경우 데이터를 직접 추가해서 사용하는경우 사용  
        
}
