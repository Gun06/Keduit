package A1305반복문과자릿수;

/*
	[반복문과 십의 자리 연습]
	반복문을 사용하여 100부터 200까지의 숫자 중,
	각 숫자의 십의 자리가 2인 숫자들만 출력하는 코드를 작성해 보겠습니다.
 */

/*
	[출력예시]
	120 121 122 123 124 125 126 127 128 129  
 */

public class A1305개념01_반복문과십의자리연습 {
	public static void main(String[] args) {
		
		for(int i=100; i<=200; i++) {
			int a = i % 100 / 10;
			if(a == 2) {
				System.out.print(i + " ");
			}
		}
		
	}
}
