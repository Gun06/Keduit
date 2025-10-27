package A1305반복문과자릿수;

/*
	[반복문과 자리별 비교]
	반복문을 사용하여 100부터 300까지의 숫자 중,
	각 숫자의 십의 자리가 3이고 일의 자리가 7인 숫자들만 출력하는 코드를 작성해 보겠습니다.
 */

/*
	[출력예시]
	137 237
 */

public class A1305개념02_반복문과자리별비교 {
	public static void main(String[] args) {
		
		for(int i=100; i<=300; i++) {
			int a = i % 100 / 10;
			int b = i % 10;
			if(a == 3 && b == 7) {
				System.out.print(i + " ");
			}
		}
		
	}
}
