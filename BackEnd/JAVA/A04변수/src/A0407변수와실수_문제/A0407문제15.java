package A0407변수와실수_문제;
/*
[문제]
철수는 자전거를 타고 집에서 2300m 떨어진 학교에 갔습니다. 
학교에 도착한 후 철수는 운동장 3바퀴 반을 돌고 집으로 돌아왔습니다. 
운동장 1바퀴는 283m입니다.
철수가 오늘 다녀온 총 거리를 구하시오.        
*/

/*
[출력예시]
5590.5
*/
public class A0407문제15 {
	public static void main(String[] args) {
		double a = 2300 * 2;
		double b = 283 * 3.5;
		double c = a + b;
		
		System.out.println(String.format("%.2f", c));
	}
}
