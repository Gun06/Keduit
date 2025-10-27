package A1901예외처리_개념;

public class A1901개념01예외처리 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		// java.lang.ArithmeticException: / by zero
		
//		if(y == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println(x / y);
//		}
		
		try {
			// 에러가 발생할 코드 작성
			System.out.println(x / y);
		} catch(Exception e) {
			// try영역에서 에러가 발생하면 실행할 영역
			System.out.println("오류 발생!!!");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}