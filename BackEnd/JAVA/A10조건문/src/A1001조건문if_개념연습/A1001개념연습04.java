package A1001조건문if_개념연습;
/*
[문제]
다음은 랜덤 숫자 1에서 10 사이의 숫자 두 개를 각각 저장하고, 
큰 숫자를 먼저 출력하고 작은 숫자를 뒤에 출력하는 문제입니다.

1부터 10까지의 랜덤 숫자 두 개를 각각 저장하시오. 
두 숫자 중 큰 숫자를 먼저 출력하고 작은 숫자를 뒤에 출력하고,
두 숫자가 같으면 "같다"를 출력합니다.    
*/

import java.util.Random;

/*
[출력예시]
1 6
6 1    
*/
public class A1001개념연습04 {
	public static void main(String[] args) {
		Random ran = new Random();
		 int a = ran.nextInt(2) + 1;
		   int b = ran.nextInt(2) + 1;
		   System.out.println(a + " " + b);

		    if(a > b) {
		    	System.out.println(a + " " + b);
		    }
		    if(a < b) {
		    	System.out.println(b + " " + a);
		    }
		    if(a == b) {
		    	System.out.println("같다");
		    }
	}
}
