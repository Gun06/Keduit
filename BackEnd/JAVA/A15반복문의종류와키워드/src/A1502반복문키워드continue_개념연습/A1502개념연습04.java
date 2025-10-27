package A1502반복문키워드continue_개념연습;

import java.util.Random;

/*
[문제]
1부터 9사이의 랜덤 숫자 두 개를 저장하고,
그 숫자의 합이 10이 되면 종료하는 프로그램을 작성하시오.
단, continue와 break를 사용하시오.
*/
/*
[출력예시]
9 1
*/
public class A1502개념연습04 {
	public static void main(String[] args) {
		Random ran = new Random();
		 while(true){
			 int r1 = ran.nextInt(9) + 1;
			 int r2 = ran.nextInt(9) + 1;
			 int total = r1 + r2;
		        
		        if(total != 10){
		            continue;
		        }
		        System.out.println(r1 + " " + r2);
		        break;
		    }
	}
}
