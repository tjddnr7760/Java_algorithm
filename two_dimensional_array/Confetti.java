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
 */


public class Confetti {
    
}