package A1401반복문과누적_개념연습;

import java.util.Random;

/*
[문제]
아래 조건을 5회 반복해서 실행합니다.

[조건]
(1) 0부터 100 사이의 랜덤 숫자를 출력합니다. (학생 점수)
(2) 번호는 1번부터 시작하며, 번호와 점수를 함께 출력합니다.
(3) 점수가 60점 이상이면 합격생입니다.
(4) 합격생은 점수 옆에 [합격], 불합격생은 [불합격]을 출력합니다.
(5) 전체 학생(5명)의 총점과 평균을 출력합니다.
*/
/*
[출력예시]
1 번 89 점 [합격]
2 번 46 점 [불합격]
3 번 51 점 [불합격]
4 번 78 점 [합격]
5 번 2 점 [불합격]
평균: 26.6
*/
public class A1401개념연습11 {
	public static void main(String[] args) {
		Random ran = new Random();
		 int total = 0;
	    for(int i = 1; i < 6; i++){
	    	int r = ran.nextInt(101);
	        if(r >= 60){
	        	System.out.println(i + "번" + r + "점" + "[합격]");
	        }else{
	        	System.out.println(i + "번" + r + "점" + "[불합격]");
	        }
	        total += r;
	    }
	    System.out.println(total);
	    double avg = (double)total / 5;
	    System.out.println(avg);
	}
}
