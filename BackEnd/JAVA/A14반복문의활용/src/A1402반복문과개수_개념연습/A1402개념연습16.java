package A1402반복문과개수_개념연습;

import java.util.Random;

/*
[문제]
1부터 9 사이의 랜덤 값을 3개 출력합니다.
모든 숫자가 전부홀수이면 "1등"을 출력하고, 
모든 숫자가 전부짝수이면 "2등"을 출력하고,
그외는 "꽝"을 출력합니다.
*/
/*
[출력예시]
9 7 6 
꽝

[출력예시]
3 3 9 
1등

[출력예시]
6 4 2 
2등
*/
public class A1402개념연습16 {
	public static void main(String[] args) {
		Random ran = new Random();
		int count = 0;
	    for(int i = 0; i < 3;  i++){
	    	int r = ran.nextInt(9) + 1;
	    	System.out.print(r + " ");
	        if(r % 2 == 1){
	            count += 1;
	        }
	    }
	    System.out.println();
	    if(count == 3){
	    	System.out.println("1등");
	    }else if(count == 0){
	    	System.out.println("2등");
	    }else{
	    	System.out.println("꽝");
	    }
	}
}
