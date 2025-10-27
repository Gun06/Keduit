package A1102추가계산_개념연습;
/*
[문제]
철수는 마트에서 오렌지 한 개에 1000원, 사과 한 개에 800원에 팔고 있는 것을 보았습니다.
단, 마트에서는 오렌지와 사과를 합쳐서 10개 이상 구입하면, 
각각 상품의 가격을 100원씩 할인해주는 행사를 하고 있습니다.
철수는 랜덤으로 1부터 10개의 오렌지와 1부터 10개의 사과를 구입하였습니다.
철수가 구입한 오렌지와 사과의 개수, 그리고 총 구입 가격을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
7 6
900
700
10500

[출력예시]
1 5
1000
800
5000    
*/
public class A1102개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random(); 
		int a = 1000;
		 int b = 800;
		 int r1 = ran.nextInt(10) + 1;
		 int r2 = ran.nextInt(10) + 1;
		 System.out.println(r1 + " " + r2);
		 int c = r1 + r2;
		 if(c >= 10) {
			 a = a - 100;
			 b = b - 100;
		 }
		 System.out.println(a);
		 System.out.println(b);
		 int d = a * r1 + b * r2;
		 System.out.println(d);
	}
}
