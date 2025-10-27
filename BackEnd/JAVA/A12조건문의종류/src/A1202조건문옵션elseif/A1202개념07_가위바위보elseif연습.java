package A1202조건문옵션elseif;

import java.util.Random;

/*
	[가위바위보 else if 연습]
	이해를 돕기 위해 player1은 상대편을, player2는 자신을 뜻합니다. 
	
	player1은 1~3 사이의 숫자를 랜덤으로 저장하고,
	player2는 1~3 사이의 숫자를 랜덤으로 저장합니다.
	가위, 바위, 보를 1, 2, 3 숫자로 각각 표현합니다.
	player1과 player2를 비교하여, player2를 기준으로 "비김", "승리", "패배"를 출력하시오.
	단, else if와 else를 사용하시오.
 */

/*
	[출력예시]
	player1바위
	player2가위
	패배
 */

public class A1202개념07_가위바위보elseif연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int player1 = ran.nextInt(3) + 1;
		int player2 = ran.nextInt(3) + 1;
		
		if(player1 == 1) {
			System.out.println("player1가위");
		} else if(player1 == 2) {
			System.out.println("player1바위");
		} else if(player1 == 3) {
			System.out.println("player1보");
		}
		
		if(player2 == 1) {
			System.out.println("player2가위");
		} else if(player2 == 2) {
			System.out.println("player2바위");
		} else if(player2 == 3) {
			System.out.println("player2보");
		}
		
		// 조건식의 옵션을 활용함으로써 식이 5개로 줄어든 것을 확인할 수 있다.
		int win = 0;
		if(player1 == player2) {
			win = 1;
		} else if(player1 == 1 && player2 == 2) {
			win = 2;
		} else if(player1 == 2 && player2 == 3) {
			win = 2;
		} else if(player1 == 3 && player2 == 1) {
			win = 2;
		} else {
			win = 3;
		}
		
		if(win == 1) {
			System.out.println("비김");
		} else if(win == 2) {
			System.out.println("승리");
		} else if(win == 3) {
			System.out.println("패배");
		}
		
	}
}
