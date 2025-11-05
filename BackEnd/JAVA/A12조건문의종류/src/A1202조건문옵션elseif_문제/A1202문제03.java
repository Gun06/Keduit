package A1202조건문옵션elseif_문제;

import java.util.Random;

/*
[문제]
1부터 10 사이의 랜덤 숫자 두 개를 저장한 후, 두 숫자를 비교합니다.
두 숫자 중에 더 큰 숫자를 출력합니다.
만약 서로 같으면 "같다"를 출력하시오.
단, elif와 else를 사용하시오.
*/
/*
[출력예시]
2 9
9

[출력예시]
5 5
같다
*/
public class A1202문제03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a= ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		System.out.println(a +" " +  b);
		
	    if(a > b){
	    	System.out.println(a);
	    }else if(a == b){
	    	System.out.println("같다");
	    }else{
	    	System.out.println(b);
	    }
	}
}
