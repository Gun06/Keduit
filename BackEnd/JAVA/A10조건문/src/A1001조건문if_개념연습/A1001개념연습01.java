package A1001조건문if_개념연습;
/*
[문제]
다음은 두 개의 랜덤 숫자를 생성하고, 이 숫자들이 같은지 다른지를 판별하는 문제입니다. 
1에서 2사이의 두 개의 랜덤 숫자를 생성하고 숫자들을 출력하시오.
두 숫자가 같으면 "같다", 다르면 "다르다"를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
1 1
같다    
*/
public class A1001개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		 int a = ran.nextInt(2) + 1;
		   int b = ran.nextInt(2) + 1;
		   System.out.println(a + " " + b);

		    if(a == b) {
		    	 System.out.println("같다");
		    }
		    if(a != b) {
		    	 System.out.println("다르다");
		    }
	}
}
