package A1101조건문과누적;

import java.util.Random;

/*
	[조건문과 변수]
	아래 코드에서 변수 c는 조건문 내부에서만 정의되었지만,
	그 후에도 프로그램에서 접근할 수 있습니다.
	하지만 변수 a가 5 이상일 경우 if문이 실행되지 않아서
	변수 c는 정의되지 않고, System.out.println(c)에서 오류가 발생합니다.
	
	따라서 if문 안에서 정의된 변수를 if문 밖에서 안전하게 사용하려면,
	변수가 반드시 정의 되도록 미리 초기화해야 합니다.
 */

public class A1101개념01_조건문과변수 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 변경 전
		int a = ran.nextInt(10) + 1;
		a = 10;							// a를 10으로 강제 설정하여 if문이 실행되지 않습니다.
		
		int b = 35;
		
		if(a < 5) {
			int c = b - 10;
		}
		// System.out.println(c);		// 오류 발생(c가 정의되지 않음)
		
		// 변경 후
		a = ran.nextInt(10) + 1;
		a = 10;	
		
		b = 35;
		int c = 0;						// 미리 c를 초기화하여 오류를 방지합니다.
		if(a < 5) {
			c = b - 10;
		}
		System.out.println(c);			// 안전하게 실행됩니다.
			
	}
}






