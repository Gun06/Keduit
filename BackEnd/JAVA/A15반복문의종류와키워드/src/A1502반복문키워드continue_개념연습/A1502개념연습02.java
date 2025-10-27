package A1502반복문키워드continue_개념연습;

import java.util.Random;

/*
[문제]
10부터 99 사이의 랜덤 숫자 중,
짝수만 5개 출력한 후 종료하는 프로그램을 작성하시오.
단, continue와 break를 사용하시오.
*/
/*
[출력예시]
44
64
38
90
32
*/
public class A1502개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int count = 0;
	    while(true){
	    	int r = ran.nextInt(90) + 10;
	        if(r % 2 != 0){
	            continue;
	        }
	        System.out.println(r);
	        count += 1;
	        if(count == 5){
	            break;
	        }
	    }
	}
}
