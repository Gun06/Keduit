package A1002조건문과논리_문제;
/*
[문제]
철수는 1부터 9 사이의 두 개의 숫자를 무작위로 뽑습니다. 
뽑힌 두 숫자가 연속된 숫자인지 확인하는 프로그램을 작성하시오. 
두 숫자가 연속된 숫자라면 "연속"을 출력하고, 그렇지 않다면 "꽝"을 출력하시오.
예를 들어, 1과 2, 4와 5는 연속된 숫자입니다.

[조건]
(1) 두 숫자는 1부터 9 사이의 정수입니다.
(2) 두 숫자가 연속된 숫자인 경우는 두 숫자의 차이가 정확히 1인 경우를 의미합니다. 
(3) 두 숫자가 무엇인지 출력한 후, 연속 여부에 따라 "연속" 또는 "꽝"을 출력합니다.    
*/

import java.util.Random;

/*
[출력예시]
3 4
연속    

[출력예시]
1 8
꽝        
*/
public class A1002문제12 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int r1 = ran.nextInt(9)+1;
		int r2 = ran.nextInt(9)+1;
		System.out.println(r1);
		System.out.println(r2);
		
		boolean a = r1 == r2+1;
		boolean b = r2 == r1+1;
		boolean c = a || b;
		
		if(c) {
			System.out.println("연속");
		}
		if(!c) {
			System.out.println("꽝");
		}
	}
}
