package A1701배열과누적개수_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
numberList에 0부터 100 사이의 랜덤 숫자 5개를 저장하고, 이 숫자들을 시험 점수로 간주합니다.

[조건]
(1) 60점 이상이면 합격입니다.
(2) 모든 학생이 합격하면 "전체합격"을 출력합니다.
(3) 모든 학생이 탈락하면 "전체탈락"을 출력합니다.
(4) 그 이외의 경우에는 "일부합격"을 출력하시오.
*/ 
/*
[출력예시1]
[66, 71, 79, 61]
전체합격
[출력예시2]
[42, 3, 15, 41]
전체탈락
[출력예시3]
[13, 96, 43, 50]
일부합격
*/
public class A1701개념연습03 {
	public static void main(String[] args) {
		int[] numberList= new int[4];
	    Random ran = new Random();
		for(int i = 0; i < 4; i++){
			int r = ran.nextInt(101);
	        numberList[i] = r;
	    }
		System.out.println(Arrays.toString(numberList));

	    int count = 0;

	    for(int i = 0; i < numberList.length; i++){
	        if(numberList[i] >= 60){
	            count += 1;
	        }
	    }
	    if(count == numberList.length){
	    	System.out.println("전체합격");
	    }else if(count == 0){
	    	System.out.println("전체탈락");
	    }else{
	    	System.out.println("일부합격");
	    }
	}
}
