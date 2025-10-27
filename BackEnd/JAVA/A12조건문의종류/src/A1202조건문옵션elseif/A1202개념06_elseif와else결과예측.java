package A1202조건문옵션elseif;

/*
	[조건문 옵션 else if와 else 결과 예측]
	아래식을 실행했을 때 화면에 출력되는 결과를 예상하시오.
 */

public class A1202개념06_elseif와else결과예측 {
	public static void main(String[] args) {
		
		int a = 65;
		
		if(a <= 50) {
			System.out.println("if(1)");
		} else if(a <= 60) {
			System.out.println("else if(2)");
		} else if(a <= 70) {
			System.out.println("else if(3)");
		} else {
			System.out.println("else(4)");
		}
		
	}
}
