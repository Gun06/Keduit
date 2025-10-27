package A1105최대값;

/*
	[조건문과 최대값 연습1]
	최대값은 주어진 값들 중에서 가장 큰 값을 의미합니다.
	
	숫자 557, 55, 856 사이에서,
	그 중 가장 큰 수(MAX)를 찾아 출력하시오.   
 */

/*
	[출력예시]
	557 55 856
	856	
 */

public class A1105개념01_조건문과최대값연습1 {
	public static void main(String[] args) {
		
		int a = 557;
		int b = 55;
		int c = 856;
		System.out.println(a + " " + b + " " + c);
		
		if(a >= b && a >= c) {
			System.out.println(a);
		}
		if(b >= a && b >= c) {
			System.out.println(b);
		}
		if(c >= a && c >= b) {
			System.out.println(c);
		}
		
	}
}
