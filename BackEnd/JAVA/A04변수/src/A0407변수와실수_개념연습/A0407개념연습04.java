package A0407변수와실수_개념연습;
/*
[문제]
넓이가 27인 사각형을 네 조각으로 나누었습니다.
한 조각의 넓이를 구하시오.
*/

/*
[출력예시]
6.75
*/
public class A0407개념연습04 {
	public static void main(String[] args) {
		double a = 27;
		double b = 4;
		double c = a / b;

	    System.out.println(String.format("%.2f", c));
	}
}
