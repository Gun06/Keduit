package A1203조건문종류switch_개념연습;

import java.util.Random;
/*
[문제]
	랜덤숫자(1~10) 두개를 각각 a와 b 에저장한다. 
	새로운랜덤숫자(1~3)을 c에 저장한다.
	c의 값이 1이면 a 와 b의 합을 출력한다.
	c의 값이 2이면 a 에서 b를 뺀값을 출력한다.
	c의 값이 3이면 a 와 b의 곱을 출력한다. 

	단, switch 문을 활용하시오.
	
[예시]
	a = 10
	b = 4
	c = 2
	답 : 6
*/
public class A1203개념연습01 {
	public static void main(String[] args) {
	
		
		Random ran = new Random();
	
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
	
		a = ran.nextInt(10) + 1;
		b = ran.nextInt(10) + 1;
		c = ran.nextInt(3) + 1;
	
		switch(c){
			case 1:
				d = a + b;
				break;
			case 2:
				d = a + b;
				break;
			case 3:
				d = a * b;
				break;
		}
	
		System.out.println(a + " " + b + " "  + c + " " + d);
		
	}
}
