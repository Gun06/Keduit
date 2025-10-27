package A1001조건문if;

/*
	[조건문 축약형]
		조건문의 내용이 한줄인경우 {}중괄호를 생략할수있다. 
		다만 프로그램의 안전성을위해 권장하지는 않습니다. 
*/

public class A1001개념05_조건문축약형 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(b > a) System.out.println("크다");
		
		if(b == a) System.out.println("같다");
		
		if(b < a) System.out.println("작다");
		
	}
}
