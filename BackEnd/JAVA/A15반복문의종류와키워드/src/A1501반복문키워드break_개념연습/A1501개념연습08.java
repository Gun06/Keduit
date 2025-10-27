package A1501반복문키워드break_개념연습;

import java.util.Random;

/*
[문제]
com은 1부터 20 사이의 숫자 하나를 저장합니다.
me는 com의 숫자를 모른다고 가정하고, 1부터 20 사이의 숫자를 제시합니다.
com과 me의 숫자를 비교하여 "크다", "작다", "같다"를 출력합니다.

com은 딱 한 번만 숫자를 정하고,
me는 com의 숫자를 맞출 때까지 계속해서 랜덤으로 숫자를 뽑습니다.
숫자를 맞추면 게임은 종료됩니다.
단, break를 사용하시오.
*/
/*
[출력예시]
17 19 크다
17 2 작다
17 9 작다
17 18 크다
17 3 작다
17 12 작다
17 14 작다
17 17 정답
*/
public class A1501개념연습08 {
	public static void main(String[] args) {
		Random ran = new Random();
		int com = ran.nextInt(20) + 1;
		    while(true){
		    	int me = ran.nextInt(20) + 1;
		    	System.out.println(com + " " + me + " ");
		        if(me > com){
		        	System.out.println("크다");
		        }
		        else if(me < com){
		        	System.out.println("작다");
		        }
		        else{
		        	System.out.println("정답");
		            break;
		        }
		    }    
	}
}
