package A1407개별누적;

/*
	[반복문과 개별 누적 연습]
	반복문을 사용하여 20부터 50까지의 숫자 중,
	십의 자리는 9의 약수이고, 일의 자리는 12의 약수인 숫자만 출력하시오.
	십의 자리나 일의 자리가 0이면 제외합니다.
	위 조건을 만족하는 숫자들의 각 자리 숫자의 합도 함께 출력하시오.
 */

/*
	[출력예시]
	31 4
	32 5
	33 6
	34 7
	36 9
*/

public class A1407개념01_반복문과개별누적연습 {
	public static void main(String[] args) {
		
		for(int i=20; i<=50; i++) {
			int a = i / 10;
			int b = i % 10;
			
			boolean check1 = a != 0 && b != 0;
			if(check1) {
				boolean check2 = 9 % a == 0 && 12 % b == 0;
				if(check2) {
					int total = a + b;
					System.out.println(i + " " + total);
				}
			}
		}
		
	}
}
