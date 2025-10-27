package A0407변수와실수;

public class A0407개념01_변수의크기와종류1 {
	public static void main(String[] args) {
		
		// [정수] 자료형 종류  (자바정수.PNG)
		
		int a;		// -2,147,483,648 ~ 2,147,483,647
		
		short b;    // -32,768 ~ 32,767
		
		byte c;   	// 0 ~ 65,535
		
		long d; 	// -9223372036854775808 ~ 9223372036854775807
		
		//아래 주석을 풀면 에러가 발생한다.
		//int testint = 3000000000;	
		
		// long 을 사용할때는 뒤에 L을 붙여준다.
		long testlong = 3000000000L;
		System.out.println(testlong);
		
		// 주로 int 를 사용하고, 큰숫자를 다룰때는 long을 사용한다. 
	}
}



