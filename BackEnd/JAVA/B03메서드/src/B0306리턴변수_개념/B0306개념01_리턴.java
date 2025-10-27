package B0306리턴변수_개념;

public class B0306개념01_리턴 {
	
	/*
		리턴은 함수를 강제로 종료하는 기능이있다.
	    마치 반복문의 break 와 똑같다. 
	    함수가 즉시 종료되므로 20은 출력되지않고 당연히 에러가 발생한다.
	*/
	public static void test(int a) {
		System.out.println(a);
		
		return; 
		// a = 20;
		// System.out.println(a);
	}

	
	public static void main(String[] args) {
		
		int a = 10;
		test(a);		
		// 그대로 10이 출력된다.
		System.out.println(a);
		
	}
}
