package A0207실수;
/*
	[강제 형변환연습]
 */
public class A0207개념06_강제형변환연습 {
	public static void main(String[] args) {
		
		System.out.println((float)10 + 3);
		
		System.out.println((double)10 + 3);
		
		System.out.println((int)10.333 + (int)3.677);
		
		// 10.333은 정수로 변환되지만, 3.677이 다시 실수로 변경된다.
		System.out.println((int)10.333 + 3.677); 
	}
}
