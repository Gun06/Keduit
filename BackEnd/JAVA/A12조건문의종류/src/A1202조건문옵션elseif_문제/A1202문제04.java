package A1202조건문옵션elseif_문제;

import java.util.Random;

/*
[문제]
랜덤 숫자(1~10) 두 개를 각각 저장합니다.
두 숫자를 비교하여, 더 큰 숫자를 먼저 출력하고 작은 숫자를 뒤에 출력합니다.
두 숫자가 같으면 순서상관없이 출력합니다.
단, elif와 else를 사용하시오.
*/
/*
[출력예시]
6 5

[출력예시]
8 8
*/
public class A1202문제04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a= ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		System.out.println(a +" " +  b);
		
	    if(a > b){
	    	System.out.println(a +" " +  b);
	    }else if(a < b){
	    	System.out.println(b +" " +  b);
	    }else{
	    	System.out.println(a +" " +  b);
	    }
	}
}
