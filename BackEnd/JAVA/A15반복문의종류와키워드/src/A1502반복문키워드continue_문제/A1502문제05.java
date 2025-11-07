package A1502반복문키워드continue_문제;

import java.util.Random;

/*
[문제]
반복문을 사용해서 1부터 10 사이의 랜덤 숫자 하나를 저장하고, 
숫자가 5 이하일 경우 해당 숫자를 출력하며, 
5 초과일 경우 "x"를 출력하시오.

[조건]
(1) 총 출력된 숫자가 10개가 되면 프로그램을 종료합니다.
(2) 단, continue와 break를 사용하시오.
*/
/*
[출력예시]
4 x 2 2 2 x x 1 3 2 3 5 3
3
*/
public class A1502문제05 {
	public static void main(String[] args) {
Random ran = new Random();
		 int count = 0;
		    while(true){
		    	int r1 = ran.nextInt(10) + 1;
		        if(r1 > 5){
		        	System.out.print("x ");
		        }else{
		            count += 1;
		            System.out.print(r1 + " ");
		        }
		        if(count != 10){
		            continue;
		        }
		        break;
		    }
	}
}
