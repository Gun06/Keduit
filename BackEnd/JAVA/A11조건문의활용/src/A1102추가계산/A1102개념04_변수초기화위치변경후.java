package A1102추가계산;

/*
	[변수초기화위치]
	사용될 변수 c를 c = 0과 같이 미리 초기화해두면 조건문이 실행되지않더라도,
	프로그램의 오류를 방지할수있다. 
 */

public class A1102개념04_변수초기화위치변경후 {
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 35;
		
		int c = 0;					// 미리 c를 초기화하여 오류 방지
		if(a < 5) {
			c = b -  10;
		}
		System.out.println(c);		// 안전하게 실행됩니다.
		
	}
}
