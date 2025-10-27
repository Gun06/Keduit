package A1103반올림_개념연습;
/*
[문제]
10에서 99 사이의 랜덤 숫자를 저장한 후 일의 자리에서 반올림을 하시오.
반올림이란 5이상은 10으로계산하고 , 5미만은 0으로 계산하는것을 말한다.
*/

import java.util.Random;

/*
[출력예시]
73
70

[출력예시]
37
40  
*/
public class A1103개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(90) + 10;
		System.out.println(r);
		int a = r / 10;
		int b = r % 10;
		 
		    if(b >= 5) {
		        a = a + 1;
		    }

		    int c = a * 10;
		    System.out.println(c);
	}
}
