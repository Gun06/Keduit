package A0703배수_개념연습;
/*
[문제]
철수는 암호를 만들었습니다. 
1000부터 9999 사이의 랜덤 숫자를 저장한 후, 해당 숫자의 모든 자리수의 합이 짝수이면 통과입니다. 
이를 확인할 수 있는 식을 작성해 true 또는 false로 출력하시오.  
*/

import java.util.Random;

/*
[출력예시]
2613
12
true    
*/
public class A0703개념연습09 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(9000) + 1000;
		System.out.println(r);

		    int a = r / 1000;
		    int b = r % 1000 / 100;
		    int c = r % 100 / 10;
		    int d = r % 10;
		    int e = a + b + c + d;
		    boolean f = e % 2 == 0;
		    System.out.println(e);
		    System.out.println(f);

	}
}
