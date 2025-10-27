package A1001조건문if;

/*
	[조건문]
	조건문이란 참(true)과 거짓(false)을 판단하는 명령문입니다.
	
	[문법]
	(1) 조건식이 참일 때 실행할 문장은 들여쓰기로 표현합니다.
	(2) 들여쓰기 간격은 보통 Tab을 사용하며 이는 공백 4칸을 의미합니다.
	(3) 예시
		if(조건식) {
		    조건식이 참(true)일 때, 실행할 문장;
		}  
 */

public class A1001개념01_조건문if {
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("실행O");
		}
		if(false) {
			System.out.println("실행X");
		}
		
		/*
			아래 두 가지 방법으로 두 수를 대소비교 할 수 있습니다.
			비교연산자만 사용한 경우 표현을 true, false로 밖에 할 수 없습니다.
			하지만 조건문을 사용하면 직접 "크다", "작다" 등으로 표현할 수 있습니다. 		
		 */
		
		// 방법1) 비교 연산자
		int a = 8;
		int b = 3;
		System.out.println(a > b);
		System.out.println(a < b);
		
		// 방법2) 조건문
		if(a > b) {
			System.out.println("a가 b보다 크다");
		}
		if(a < b) {
			System.out.println("a가 b보다 작다");
		}
		
	}
}







