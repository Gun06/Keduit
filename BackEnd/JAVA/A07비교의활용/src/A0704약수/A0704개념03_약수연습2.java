package A0704약수;

/*
	[약수 연습2]
	가로가 3이고 세로가 6인 사각형 넓이가 128의 약수인지 구하시오.
	
	[출력예시]
	false
 */

public class A0704개념03_약수연습2 {
	public static void main(String[] args) {
		
		int a = 3 * 6;
		boolean b = 128 % a == 0;
		System.out.println(b);
		
	}
}
