package A1502반복문키워드continue_문제;

import java.util.Random;

/*
[문제]
10부터 99 사이의 랜덤 숫자 중, 
일의 자리와 십의 자리가 같은 숫자를 5개 출력한 후 
종료하는 프로그램을 작성하시오.
단, continue와 break를 사용하시오.
*/
/*
[출력예시]
11
33
77
77
11
*/
public class A1502문제01 {
	public static void main(String[] args) {
Random ran = new Random();
		int count = 0;
	    while(true){
	    	int r = ran.nextInt(90) + 10;
	    	int a = r / 10;
	    	int b = r % 10;
	        if(a != b){
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
