package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습07 {
	/*
		 [문제]
			[1] com은 0~2 사이의 숫자를 랜덤 저장한다. 
			[2] me는  0~2 사이의 숫자를 랜덤 저장한다. 
			[3] 가위, 바위, 보를 0, 1, 2 숫자로 대신 표현한다.
			[4] com과 me를 비교해서 me를 기준으로 "비김" "승리" "패배"를 출력하시오.
	*/
	public static void solution(int me , int com ) {	
		if(me == com) {
			 System.out.println("비겼다.");
		 } 
		 if(me == 0 && com == 2) {
			 System.out.println("내가 이겼다.");
		 } 
		 if(me == 1 && com == 0) {
			 System.out.println("내가 이겼다.");
		 } 
		 if(me == 2 && com == 1) {
			 System.out.println("내가 이겼다.");
		 } 
		 if(me == 0 && com == 1) {
			 System.out.println("내가 졌다.");
		 }
		 if(me == 1 && com == 2) {
			 System.out.println("내가 졌다.");
		 }
		 if(me == 2 && com == 0) {
			 System.out.println("내가 졌다.");
		 }
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int me = ran.nextInt(3) ;
		int com = ran.nextInt(3) ;
		System.out.println(me + " " + com);
		solution(me, com);
	}

}
