package A1202조건문옵션elseif_문제;

import java.util.Random;

/*
[문제]
변수 b에 5을 저장합니다.
a는 1 ~ 9 사이의 랜덤 숫자를 저장하고,  
c는 1 ~ 9 사이의 랜덤 숫자를 저장합니다.
a와 c 중에서 어떤 숫자가 b와 더 가까운지 출력합니다.

[조건]
(1) a가 b에 더 가까우면 "a가 가깝다"  
(2) c가 b에 더 가까우면 "c가 가깝다"  
(3) a와 c가 b와의 거리가 같으면 "같다"
(4) 단, elif와 else를 사용하시오.
*/
/*
[출력예시]
4 5 3
a가 가깝다

[출력예시]
1 5 1
같다

[출력예시]
7 5 6
c가 가깝다
*/
public class A1202문제06 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a= ran.nextInt(9) + 1;
		int b = 5;
		int c = ran.nextInt(9) + 1;
		System.out.println(a +" " +  b + " " + c);

	    a = a - b;
	    c = c - b;
	    
	    if(a < 0){
	        a = -a;
	    }
	    if(c < 0){
	        c = -c;
	    }

	    if(a < c){
	    	System.out.println("a가 가깝다");
	    }else if(c < a){
	    	System.out.println("c가 가깝다");
	    }else{
	    	System.out.println("같다");
	    }
	}
}
