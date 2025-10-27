package A1002조건문과논리;

/*
	[조건문의 간결한 표현1]
	비교연산자의 결과를 변수에 저장한후, 조건문을 축약해서 사용할 수 있습니다.
 */

public class A1002개념02_조건문의간결한표현1 {
	public static void main(String[] args) {
		
		// 변수 사용 전
		if(10 == 10) {
			System.out.println("o");
		}
		if(!(10 == 10)) {
			System.out.println("x");
		}
		
		// 변수 사용 후
		boolean a = 10 == 10;
		
		if(a) {
			System.out.println("o");
		}
		if(!a) {
			System.out.println("x");
		}
		
	}
}
