package A1402반복문과개수;

/*
	[반복문 개수와 배수 연습]
	반복문을 사용하여 5에서 15 사이의 숫자 중 
	4의 배수를 찾아 그 개수를 출력하시오.
 */

/*
	[출력예시]
	2
 */

public class A1402개념03_반복문개수와배수연습 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=5; i<=15; i++) {
			boolean check = i % 4 == 0;
			if(check) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}
}
