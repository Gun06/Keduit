package A1201조건문종류else;

/*
	[조건문 옵션 else 연습]
	11이 홀수이면 "홀수", 짝수이면 "짝수" 를 출력하시오. 
	단, else를 사용하시오.
 */

public class A1201개념02_조건문옵션else연습 {
	public static void main(String[] args) {
		
		int a = 11;
		
		// if만 사용
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		if(a % 2 == 1) {
			System.out.println("홀수");
		}
		
		// else 사용
		if(a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}
}
