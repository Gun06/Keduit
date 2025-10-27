package A1901예외처리_개념;

public class A1901개념02예외처리 {
	public static void main(String[] args) {
		
		// 주석처리 해보면서 하나씩 실행해보자 
		int[] arr = new int[3];
		try {
			arr[100] = 100;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		
		//-----------------------------------
		
		int a = 10;
		try {
			int b = a/0;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		//-----------------------------------
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
}