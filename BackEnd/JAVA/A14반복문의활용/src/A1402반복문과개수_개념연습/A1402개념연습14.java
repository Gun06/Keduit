package A1402반복문과개수_개념연습;

import java.util.Random;

/*
[문제]
10에서 200 사이의 랜덤 숫자를 저장한 후,
그 숫자의 약수 중 홀수의 개수가 4이면 "당첨", 그렇지 않으면 "꽝"을 출력하시오.
*/
/*
[출력예시]
141
1 3 47 141
당첨

[출력예시]
32
1
꽝
*/
public class A1402개념연습14 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(191) + 10;
		System.out.println(r);
		int count = 0;
	    for(int i = 1; i < r + 1; i++){
	        boolean check1 = r % i == 0;
	        boolean check2 = i % 2 == 1;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    if(count == 4){
	    	System.out.println("당첨");
	    }else{
	    	System.out.println("당첨");
	    }
	}
}
