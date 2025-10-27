package A1705배열과무한반복_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
1부터 10 사이의 랜덤 숫자 3개를 numberList에 추가하되,
모든 숫자는 서로 달라야 하며, 세 숫자의 합이 20이 되도록 추가합니다.
추가된 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
[5, 9, 6]
*/
public class A1705개념연습01 {
	public static void main(String[] args) {
		 int[] numberList = new int[3];
		 Random ran =new Random();
		    while(true){
		    	int r1 = ran.nextInt(10) + 1;
		    	int r2 = ran.nextInt(10) + 1;
		    	int r3 = ran.nextInt(10) + 1;
		        int total = r1 + r2 + r3;
		        boolean check1 = total == 20;
		        boolean check2 = r1 != r2 && r1 != r3 && r2 != r3;
		        boolean check3 = check1 && check2;
		        if(check3){
		            numberList[0] = r1;
		            numberList[1] = r2;
		            numberList[2] = r3;
		            break;
		        }
		    }
		    System.out.println(Arrays.toString(numberList) );
	}
}
