package B0301메서드_개념;

public class B0301개념06_계산기 {
	/*
	  	사칙연산 계산 기능이 있는 함수를 만들어보자
	 
	 */
	public static void plus(int a , int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public static void minus(int a , int b) {
		int result = a - b;
		System.out.println(result);
	}
	
	public static void multiply(int a , int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	public static void division(int a , int b) {
		double result = (double)a / b;
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
				
		plus(10, 3);
		minus(10, 3);
		multiply(10, 3);
		division(10, 3);
		
		// 여러번 활용하기
		plus(10, 20);
		plus(10, 30);
	}

}
