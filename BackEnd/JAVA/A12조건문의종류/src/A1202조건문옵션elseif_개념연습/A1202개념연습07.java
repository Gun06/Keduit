package A1202조건문옵션elseif_개념연습;

import java.util.Random;

/*
[문제]
1부터 99 사이의 랜덤 숫자를 저장합니다.
랜덤 숫자를 각 자리별로 분리한 후, 숫자 중에 3, 6, 9가 포함된 개수를 확인합니다.

[조건]
(1) 3, 6, 9의 개수가 2개이면 "짝짝"을 출력합니다.  
(2) 3, 6, 9의 개수가 1개이면 "짝"을 출력합니다.  
(3) 3, 6, 9가 없으면 해당 숫자를 그대로 출력합니다.
(4) 단, elif와 else를 사용하시오.
*/
/*
[출력예시]
33
짝짝

[출력예시]
26
짝

[출력예시]
11
11
*/
public class A1202개념연습07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(99) + 1;
		System.out.println(a);
		int b = a / 10;
		int c = a % 10;
		int count = 0;
	
	    if(b == 3 || b == 6 || b == 9){
	        count = count + 1;
	    } 
	    if(c == 3 || c == 6 || c == 9){
	        count = count + 1;
	    }
	
	    if(count == 2){
	    	System.out.println("짝짝");
	    }else if(count == 1){
	    	System.out.println("짝");
	    }else{
	    	System.out.println(a);
	    }
	}
}
