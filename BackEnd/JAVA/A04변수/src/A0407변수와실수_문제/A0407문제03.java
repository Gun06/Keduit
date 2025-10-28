package A0407변수와실수_문제;
/*
[문제]
피자가 8조각이 있고, 한 조각의 넓이가 23.3입니다.
전체 피자의 넓이를 구하시오.        
*/

/*
[출력예시]
186.4
*/
public class A0407문제03 {
	public static void main(String[] args) {
		double a = 23.3;
		double b = 8;
		double c = a * b;

	    System.out.println(String.format("%.2f", c));
	}
}
