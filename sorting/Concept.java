/**
 *  정렬 알고리듬 정리
 *  
 *  - 정렬 알고리즘 구분 기준
 *      1. 시간 복잡도 차이
 *      2. 메모리 용량 차이
 *      3. 안정성 stability 차이
 *          -> 같은 키값을 가진 데이터를 정렬했을때 순서가 바뀌지 않는 경우
 *          정렬하고 버그를 생성하지 않게 하기 위해 고려해야한다.
 *      4. 직렬, 병렬 차이
 * 
 *      정렬은 모든 요소들을 최소 한번씩이라도 방문한다.
 *      따라서 시간복잡도는 최소 O(N)이다.
 *  
 *  - 버블정렬(O(N^2), O(N^2)), 메모리 O(1), 안정성 O
 *      간단히 구현할 때
 *      앞에서부터 두개씩 비교해서 큰것을 뒤로 정렬한다.
 *      가장 큰 값을 가장 오른쪽으로 정렬한다.
 *      가장 큰 오른쪽 값을 제외하고 다시 처음부터 두번째로 큰 수를 정렬한다.
 *      원소가 하나 남을때까지 반복한다.
 *      총 N-1회를 훑게 된다. 같은 값 끼리는 순서가 변동되지 않기 때문에 안정적이다.
 *      가장 많이 방문했던 요수 N - 1
 *      가장 적게 방문했던 요소수 1
 *      평균 방문 요소 -> (N -1 + 1)/2 = N/2 * 목록 훑는 총 횟수 (N - 1)회
 *      따라서 시간복잡도 N^2
 *      메모리는 추가된것 없음을 O(1)
 * 
 *  - 선택정렬(O(N^2), O(N^2)), 메모리 O(1), 안정성 X
 *      전체중 최솟값을 찾아 선택해서 맨 처음에 정렬한다.
 *      총 갯수 - 1 횟수만큼 마지막까지 반복 진행한다.
 * 
 *  - 삽입정렬(O(N^2), O(N^2)), 메모리 O(1), 안정성 O
 *      원소를 하나씩 삽입하면서 버블 정렬처럼 하나씩 정렬한다.
 * 
 *  - 퀵정렬(O(NlogN), O(N^2)), 스택 메모리 O(log N), 안정성 X
 *      실무에서는 퀵정렬을 대부분 사용한다.
 *      기본적으로는 퀵 정렬을 사용하면 된다.
 *      일반적으로 범용적으로 가장 빠르다.
 *      가장 오른쪽 pivot(기준값)을 하나 정해서
 *      start와 end를 각 양쪽에 둔 상태에서
 *      pivot 값을 기준으로 작은값 큰 값을 스왑하면서
 *      모든 원소가 방문될 때까지 반복한다.
 *      결국 pivot기준으로 값이 왼쪽 배열 오른쪽 배열로 나뉘게 되고
 *      각각의 배열을 재귀적으로 호출하여 최종적으로 정렬이되면 마무리한다 
 *      랜덤한 값을 pivoct으로 사용할때 최악의 경우의수가 나온는 경우는 매우 드물다
 * 
 *  - 병합정렬(O(NlogN), O(NlogN)), 힙 메모리 O(N), 안정성 O
 *      어떤 경우에도 느려지면 안될때
 *      정렬된 두 배열을 합치는 경우 
 *      입력 배열을 재귀적으로 나누어서 요소수가 1인 배열을 만든다
 *      다시 합치면서 정렬을 하면서 전체를 합치게 된다
 * 
 *  - 힙정렬 (O(NlogN), O(NlogN)), 메모리 O(1), 안정성 X
 *      어떤 경우에도 느려지면 안될때
 *      트리에 배열을 입력해서 트리 구조에 맞게 재배치한다
 *      pop할때 재정렬 하면서 큰 요소부터 빼낸다
 * 
 */

public class Concept {
    
}