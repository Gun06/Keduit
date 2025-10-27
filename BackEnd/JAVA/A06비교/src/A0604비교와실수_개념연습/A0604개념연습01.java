package A0604비교와실수_개념연습;
/*
[문제]
넓이가 27인 사각형을 네 조각으로 나누었고, 넓이가 16인 삼각형을 두 조각으로 나누었습니다. 
각각의 한 조각의 넓이가 같은지 확인하고, true 또는 false로 출력하시오. 
*/

/*
[출력예시]
6.75
8.00
false
*/
public class A0604개념연습01 {
	public static void main(String[] args) {
		double a = 27;
		double b = a / 4;
		System.out.println(String.format("%.2f", b));

	    double c = 16;
	    double d = c / 2;
		System.out.println(String.format("%.2f", d));

	    boolean e = b == d;
		System.out.println(e);
	}
}
