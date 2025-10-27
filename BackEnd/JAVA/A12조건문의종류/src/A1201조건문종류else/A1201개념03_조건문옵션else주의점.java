package A1201조건문종류else;

import java.util.Random;

/*
	[조건문 옵션 else 주의점]
	else는 항상 하나의 if문에만 연결되기 때문에, 아래와 같은 상황에서 주의해야 합니다.
	
	1부터 5 사이의 랜덤 숫자를 저장합니다.
	(1) 숫자가 1이면 "아메리카노"를 출력합니다.
	(2) 숫자가 2이면 "카페라떼"를 출력합니다.
	(3) 숫자가 3이면 "모카라떼"를 출력합니다.
	(4) 그 외의 경우에는 "주문취소"를 출력합니다.
 */

/*
	[출력예시]
	2
	까페라떼
	주문취소
 */

public class A1201개념03_조건문옵션else주의점 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(5) + 1;
		a = 2;
		System.out.println(a);
		
		if(a == 1) {
			System.out.println("아메리카노");
		}
		if(a == 2) {
			System.out.println("카페라떼");
		}
		if(a == 3) {
			System.out.println("모카라떼");
		} else {
			/*
				아래 문장도 같이 출력됩니다.
				else는 if 한 개만 연결되기 때문에 경우의 수가 두 개일 때만 사용합니다.			 
			 */
			System.out.println("주문취소");
		}
	}
}
