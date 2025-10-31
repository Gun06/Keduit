package A1002조건문과논리_문제;
/*
[문제]
철수는 학교에서 시험을 치렀습니다. 
시험 점수가 60 이상이면 합격입니다. 
철수가 합격인지 불합격인지를 판단하는 프로그램을 작성하세요.
0에서 100 사이의 랜덤 숫자를 생성하세요.
점수는 4점 단위로 주어집니다. 
예를들어 91점같은 점수는 나올 수 없습니다. 
점수가 60 이상이고 100 이하이면 "합격"을 출력하고, 그렇지 않으면 "불합격"을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
56
불합격    

[출력예시]
76
합격        
*/
public class A1002문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(26);
		r = r * 4;
		System.out.println(r);
		
		boolean a = 60<=r && r<= 100;
		boolean b = r < 60 && r <= 100;

	    if(a) {
	    	System.out.println("합격");
	    }
	    if(b) {
	    	System.out.println("불합격");
	    }
	}
}
