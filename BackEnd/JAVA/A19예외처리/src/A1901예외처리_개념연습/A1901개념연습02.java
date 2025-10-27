package A1901예외처리_개념연습;

/*
[아래 식을 예외처리하시오. finally를 사용하시오]

*/
public class A1901개념연습02 {
	public static void main(String[] args) {
				
		int num1 = 10;
		int num2 = 0;
		
		try {
			System.out.println(num1 / num2);
			
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
			
		}
		
	}
}