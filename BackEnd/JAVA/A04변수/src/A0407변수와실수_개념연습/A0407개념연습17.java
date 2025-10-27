package A0407변수와실수_개념연습;
/*
[문제]
사과 15개의 무게는 8/25kg 입니다.
이때, 사과 3개와 사과 반 개의 무게를 계산하여 소수점 두 자리까지 출력하시오.        
*/
/*
[출력예시]
0.07
*/
public class A0407개념연습17 {
	public static void main(String[] args) {
		double a = 8.0 / 25;
		double b = a / 15;
		double c = b * 3.5;
		
		System.out.println(String.format("%.2f", c));
		
	}
}
