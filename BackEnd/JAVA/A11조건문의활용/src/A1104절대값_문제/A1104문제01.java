package A1104절대값_문제;

import java.util.Random;

/*
    [문제]
    1부터 10까지의 랜덤 숫자 두 개를 저장합니다.
    첫 번째 숫자에서 두 번째 숫자를 뺀 값을 구하시오.
    만약 그 값이 음수라면, 절대값(양수)으로 변경하여 출력하시오.    
*/

/*
    [출력예시]
    6 7
    -1
    1    
*/
public class A1104문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(10) + 1;
		int r2 = ran.nextInt(10) + 1;
		System.out.println(r1 + " " + r2);
		
		int a = r1 - r2;
		System.out.println(a);
		
		if(a<0) {
			a = -a;
			System.out.println(a);
		}
	}
}
