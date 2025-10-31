package A1110조건문과중첩_문제;
/*
[문제]
키오스크에서 커피를 주문을 합니다.
아메리카노는 1000원, 카페라떼는 1500원, 모카라떼는 2000원입니다.

[조건]
(1) 1에서 4번 중 하나를 랜덤으로 선택하여 번호를 저장합니다.
(2) 입금할 돈은 800원에서 2400원 사이에서 100원 단위로 랜덤으로 저장합니다.
(3) 입금한 돈이 주문 금액보다 부족할 경우 "금액이 부족합니다"를 출력합니다.
(4) 4번을 선택한 경우 "잘못된 번호입니다"를 출력합니다.
(5) 각각의 주문에 대한 결과를 출력하고, 거스름돈을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
커피 메뉴
1번 아메리카노 1000원
2번 까페라떼 1500원
3번 모카라떼 2000원
1
1600
아메리카노를 주문합니다
600

[출력예시]
커피 메뉴
1번 아메리카노 1000원
2번 까페라떼 1500원
3번 모카라떼 2000원
3
900
금액이 부족합니다
900    
*/
public class A1110문제04 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("커피 메뉴");
		System.out.println("1번 아메리카노 1000원");
		System.out.println("2번 까페라떼 1500원");
		System.out.println("3번 모카라떼 2000원");
		int r1 = ran.nextInt(4) + 1;
		System.out.println(r1);
		int r2= ran.nextInt(17) + 8;
		r2 = r2 * 100;
		System.out.println(r2);
		int a = r2;
		
		if(r1 == 1) {
	        if(r2 >= 1000) {
	            a = r2 - 1000;
	            System.out.println("아메리카노를 주문합니다");
	        }
	        if(r2 < 1000) {
	        	 System.out.println("금액이 부족합니다");
	        }
	    }

	    if(r1 == 2) {
	        if(r2 >= 1500) {
	            a = r2 - 1500;
	            System.out.println("까페라떼를 주문합니다");
	        }
	        if(r2 < 1500) {
	        	System.out.println("금액이 부족합니다");
	        }
	    }

	    if(r1 == 3) {
	        if(r2 >= 2000) {
	            a = r2 - 2000;
	            System.out.println("모카라떼를 주문합니다");
	        }
	        if(r2 < 2000) {
	        	System.out.println("금액이 부족합니다");
	        }
	    }        
	    if(r1 == 4) {
	    	System.out.println("잘못된 번호입니다");
	    }
	    System.out.println(a);
	}
}
