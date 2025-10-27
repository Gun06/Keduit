package A0407변수와실수_개념연습;
/*
[문제]
철수네 동네 놀이터는 가로 13.8m, 세로 8.4m 크기입니다. 
이번에 가로와 세로를 각각 1.5배 늘리는 공사를 하게 되었습니다. 
공사 후 철수네 동네 놀이터의 넓이를 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
260.82
*/
public class A0407개념연습16 {
	public static void main(String[] args) {
		double a = 13.8 * 1.5;
		double b = 8.4 * 1.5;
		double c = a * b;
		
		System.out.println(String.format("%.2f", c));
		
	}
}
