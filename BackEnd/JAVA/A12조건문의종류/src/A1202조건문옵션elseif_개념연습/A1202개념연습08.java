package A1202조건문옵션elseif_개념연습;

import java.util.Random;

/*
[문제]
키오스크에서 커피를 주문을 합니다.
아메리카노는 1000원, 카페라떼는 1500원, 모카라떼는 2000원입니다.

[조건]
(1) 1~4번 중 하나를 랜덤으로 선택하여 번호를 저장합니다.
(2) 입금할 돈은 800~2400 사이에서 100원 단위로 랜덤으로 저장합니다.
(3) 입금한 돈이 주문 금액보다 부족할 경우 "금액이 부족합니다"를 출력합니다.
(4) 4번을 선택한 경우 "잘못된 번호입니다"를 출력합니다.
(5) 각각의 주문에 대한 결과를 출력하고, 거스름돈을 출력하시오.
(6) 단, elif와 else를 사용하시오.
*/
/*
[출력예시]
커피 메뉴
1번 아메리카노 1000원
2번 까페라떼 1500원
3번 모카라떼 2000원
2
2200
까페라떼를 주문합니다
700

[출력예시]
커피 메뉴
1번 아메리카노 1000원
2번 까페라떼 1500원
3번 모카라떼 2000원
3
1800
금액이 부족합니다
1800

[출력예시]
커피 메뉴
1번 아메리카노 1000원
2번 까페라떼 1500원
3번 모카라떼 2000원
4
1600
잘못된 번호입니다
1600
*/
public class A1202개념연습08 {
	public static void main(String[] args) {
	 	System.out.println("커피 메뉴");
	    System.out.println("1번 아메리카노 1000원");
	    System.out.println("2번 까페라떼 1500원");
	    System.out.println("3번 모카라떼 2000원");
	    Random ran = new Random();
	    int a = ran.nextInt(4) + 1;
	    int b = ran.nextInt(17) + 8;
	    b = b * 100;
	    System.out.println(a );
	    System.out.println(b );

	    if(a == 1){
	        if(b < 1000){
	            System.out.println("금액이 부족합니다");
	        }else if(b >= 1000){
	            System.out.println("아메리카노를 주문합니다");
	            b = b - 1000;
	        }

	    }else if(a == 2){
	        if(b < 1500){
	            System.out.println("금액이 부족합니다");
	        }else if(b >= 1500){
	            System.out.println("까페라떼를 주문합니다");
	            b = b - 1500;
	        }

	    }else if(a == 3){
	        if(b < 2000){
	            System.out.println("금액이 부족합니다");
	        }else if(b >= 2000){
	            System.out.println("모카라떼를 주문합니다");
	            b = b - 2000;
	        }
	    }else{
	        System.out.println("잘못된 번호입니다");
	    }
	    System.out.println(b);
	}
}
