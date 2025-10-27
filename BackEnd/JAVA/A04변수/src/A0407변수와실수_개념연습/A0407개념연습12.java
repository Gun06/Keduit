package A0407변수와실수_개념연습;
/*
[문제]
길이 12/9m 인 끈에서 길이 3/12m 를 잘라냈습니다.
남은 끈의 길이를 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
1.08
*/
public class A0407개념연습12 {
	public static void main(String[] args) {
		double a = 12.0 / 9;
		double b = 3.0 / 12;
		double c = a - b;

	    System.out.println(String.format("%.2f", c));
	}
}
