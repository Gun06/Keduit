package A1501반복문키워드break_개념연습;

import java.util.Random;

/*
[문제]
1부터 100 사이의 랜덤 숫자를 무한히 출력하되, 
첫 숫자는 1부터 시작하고, 다음 숫자가 이전 숫자보다 작거나 같으면 종료합니다.
단, break를 사용하시오.
*/
/*
[출력예시]
1 69 72 66
*/
public class A1501개념연습07 {
	public static void main(String[] args) {
		int a = 1;
		System.out.print(a + " ");
		Random ran = new Random();
	    while(true){
	    	int r = ran.nextInt(100) + 1;
	    	System.out.print(r + " ");
	        if(a >= r){
	            break;
	        }else{
	            a = r;
	        }
	    }
	}
}
