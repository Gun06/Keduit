package A1403반복문과최대값_개념연습;

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
(6) 1등의 번호와 점수를 출력합니다.
(7) 동점자가 나오는 경우는 번호가 빠른 학생을 출력합니다. 
*/
/*
[출력예시]
1번27점[불합격]
2번15점[불합격]
3번35점[불합격]
4번35점[불합격]
5번62점[합격]
174
34.8
1등:5번62점
*/
public class A1403개념연습02 {
	public static void main(String[] args) {
		 int max = 0;
		    int maxNumber = 1;
		    int total = 0;
		    Random ran = new Random();
		    for(int i = 1; i < 6; i++){
		    	int r = ran.nextInt(101);
		        if(r >= 60){
		        	System.out.println(i + "번" + r + "점" + "[합격]");
		        }else{
		        	System.out.println(i + "번" + r + "점" + "[불합격]");
		        }
		        total += r;
		        
		        if(max < r){
		            max = r;
		            maxNumber = i;
		        }
		    }
		    
		    System.out.println(total);
		    double avg = (double)total / 5;
		    System.out.println(avg);
		    System.out.println("1등:" + maxNumber + "번" + max + "점");
	}
}
