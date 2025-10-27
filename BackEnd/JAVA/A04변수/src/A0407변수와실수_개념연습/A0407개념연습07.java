package A0407변수와실수_개념연습;
/*
[문제]
철수는 다이어트를 하여 체중을 감량하였습니다.
처음 체중은 96.93kg이었고, 첫 5개월 동안 13.32kg을 감량했습니다. 
이어서 다음 5개월 동안 6.3kg을 추가로 감량했습니다.
현재 철수의 체중을 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
77.31
*/
public class A0407개념연습07 {
	public static void main(String[] args) {
		double a = 96.93;
		double b = 13.32;
		double c = 6.3;
		double d = a - b - c;

	    System.out.println(String.format("%.2f", d));
	}
}
