package A0207실수_개념연습;
/*
	[문제]
	철수는 자전거를 타고 집에서 2300m 떨어진 학교에 갔습니다. 
	학교에 도착한 후 철수는 운동장 3바퀴 반을 돌고 집으로 돌아왔습니다. 
	운동장 1바퀴는 283m입니다.
	철수가 오늘 다녀온 총 거리를 구하시오.
	
	[출력예시]
	5590.5
 */
public class A0207개념연습14 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", 2300 * 2 + 283 * 3.5));
	}
}
