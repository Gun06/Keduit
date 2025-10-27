package A0202나누기와몫;
/*
	[나누기에러]			
		자바에서는 0으로 나눌수가없다. 
		
		아래 프로그램을 실행시키면 다음과같은 에러가 발생한다.
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		나누기 할때는 주의가 필요하다. 
*/
public class A0202개념03_나누기에러 {
	public static void main(String[] args) {
		
		// 주석을 해제하고 실행해보면 에러가 발생한다. 
		//System.out.println(10 / 0);
		
		
		//반대의 경우의 결과는 0이다. 
		System.out.println(0 / 10);		
	}
}
