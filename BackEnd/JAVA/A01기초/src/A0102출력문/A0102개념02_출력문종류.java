package A0102출력문;
/*
	출력문의 종류
	System.out.
	(1) 줄 바꿈이 있는 출력 : System.out.println("문자")
	(2) 줄 바꿈이 없는 출력 : System.out.print("문자")
	(3) 줄 바꿈 : System.out.println()
*/
public class A0102개념02_출력문종류 {
	public static void main(String[] args) {
		
		// print()함수는 줄바꿈이 되지않는다
		System.out.print("안");
		System.out.print("녕");
		
		// println()함수에 아무 내용도 안 적으면 줄 바꿈이 된다
		System.out.println();
		
		System.out.println("하세요");
	}
}
