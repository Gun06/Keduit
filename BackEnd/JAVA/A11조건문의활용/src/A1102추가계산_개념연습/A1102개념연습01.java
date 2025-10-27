package A1102추가계산_개념연습;
/*
[문제]
철수는 주사위 2개를 가지고 있습니다.
주사위는 각각 1부터 6까지의 눈금을 가지고 있습니다.
철수가 두 개의 주사위를 던졌을 때, 두 눈의 합을 출력하시오.
단, 두 주사위의 눈금이 같으면 그 합에 6을 추가로 더하시오.    
*/

import java.util.Random;

/*
[출력예시]
3 2
5

[출력예시]
2 2
10   
*/
public class A1102개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(2) + 1;
		int r2 = ran.nextInt(2) + 1;
		System.out.println(r1 + " " + r2);
			
	    int a = r1 + r2;
	    if(r1 == r2) {
	        a = a + 6;
	    }
	    System.out.println(a);
	}
}
