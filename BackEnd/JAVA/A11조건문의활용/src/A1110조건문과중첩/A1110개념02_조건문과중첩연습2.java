package A1110조건문과중첩;

import java.util.Random;

/*
	[조건문의 중첩 연습2]
	이해를 돕기 위해 player1은 상대편을, player2는 자신을 뜻합니다. 
	
	player1은 1~3 사이의 숫자를 랜덤으로 저장하고,
	player2는 1~3 사이의 숫자를 랜덤으로 저장합니다.
	가위, 바위, 보를 1, 2, 3 숫자로 각각 표현합니다.
	player1과 player2를 비교하여, player2를 기준으로 "비김", "승리", "패배"를 출력하시오.
 */

/*
	[출력예시]
	player1바위
	player2보
	승리
 */

public class A1110개념02_조건문과중첩연습2 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int player1 = ran.nextInt(3) + 1;
		int player2 = ran.nextInt(3) + 1;
		
		if(player1 == 1) {
			System.out.println("player1가위");
		}
		if(player1 == 2) {
			System.out.println("player1바위");
		}
		if(player1 == 3) {
			System.out.println("player1보");
		}
		
		if(player2 == 1) {
			System.out.println("player2가위");
		}
		if(player2 == 2) {
			System.out.println("player2바위");
		}
		if(player2 == 3) {
			System.out.println("player2보");
		}
		
		int win = 0;
		if(player1 == player2) {
			win = 1;
		}
		if(player1 == 1) {
			if(player2 == 2) {
				win = 2;
			}
			if(player2 == 3) {
				win = 3;
			}
		}
		if(player1 == 2) {
			if(player2 == 1) {
				win = 3;
			}
			if(player2 == 3) {
				win = 2;
			}
		}
		if(player1 == 3) {
			if(player2 == 1) {
				win = 2;
			}
			if(player2 == 2) {
				win = 3;
			}
		}
		
		if(win == 1) {
			System.out.println("비김");
		}
		if(win == 2) {
			System.out.println("승리");
		}
		if(win == 3) {
			System.out.println("패배");
		}
		
	}
}
