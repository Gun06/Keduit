package A1308반복문거꾸로;

/*
	[반복문 for 거꾸로 연습]
	for문을 사용하여 12부터 5까지 거꾸로 출력해 보겠습니다.
 */

/*
	[출력예시]
	12 11 10 9 8 7 6 5
 */

public class A1308개념03_반복문for거꾸로연습 {
	public static void main(String[] args) {
		
		int num = 12;
		for(int i=5; i<=12; i++) {
			System.out.print(num + " ");
			num -= 1;
		}
		
	}
}
