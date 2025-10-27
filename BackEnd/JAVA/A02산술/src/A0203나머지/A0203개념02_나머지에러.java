package A0203나머지;
/*
	[나머지 에러]			
		나머지도 나누기와 같은 원리이므로, 나누기와 같은에러가 발생한다.
		
		Exception in thread "main" java.lang.ArithmeticException: / by zero
*/
public class A0203개념02_나머지에러 {
	public static void main(String[] args) {
		
		// 주석을 해제하고 실행해보면 에러가 발생한다. 
		// System.out.println(10 % 0);
		
		
		//반대의 경우의 결과는 0이다. 
		System.out.println(0 % 10);		
	}
}
