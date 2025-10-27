package A1502반복문키워드continue_개념연습;

import java.util.Random;

/*
[문제]
1부터 10 사이의 서로 다른 랜덤 숫자 3개를 각각의 변수에 저장하고, 
숫자 3개의 합이 20이 되면 종료합니다.
단, continue와 break를 사용하시오.
*/
/*
[출력예시]
9 6 5
*/
public class A1502개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		while(true){
			int r1 =ran.nextInt(10) + 1;
			int r2 =ran.nextInt(10) + 1;
			int r3 =ran.nextInt(10) + 1;
	        int total = r1 + r2 + r3;
	        boolean check = r1 != r2 && r2 != r3 && r3 != r1;
	        if(total != 20){
	            continue;
	        }
	        System.out.println(r1 + " " + r2 + " " + r3);
	        break;
	    }
	}
}
