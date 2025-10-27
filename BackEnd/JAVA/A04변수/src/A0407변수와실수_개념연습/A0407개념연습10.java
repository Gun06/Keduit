package A0407변수와실수_개념연습;
/*
[문제]
가로가 3cm, 세로가 7cm인 파란색 색종이 11장이 있습니다.
또한 가로가 3cm, 세로가 7cm인 빨간색 색종이 절반 장이 있습니다.
모든 색종이의 넓이의 합을 구하시오.        
*/

/*
[출력예시]
241.5
*/
public class A0407개념연습10 {
	public static void main(String[] args) {
		double a = 3;
		double b = 7;
		double c = 11;
		double d = a * b * 11;
		double e = a * b * 0.5;
		double f = d + e;

	    System.out.println(String.format("%.2f", f));
	}
}
