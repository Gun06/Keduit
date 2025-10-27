package A1705배열과무한반복_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
numberList에 1부터 100 사이의 랜덤 숫자 5개를 저장하되, 홀수만 저장합니다.
만약 짝수를 선택하면 "선택실수"라고 출력하시오.
*/ 
/*
[출력예시]
[95, 0, 0, 0, 0]
[95, 67, 0, 0, 0]
38 선택실수
92 선택실수
[95, 67, 29, 0, 0]
16 선택실수
[95, 67, 29, 19, 0]
92 선택실수
[95, 67, 29, 19, 5]
*/
public class A1705개념연습02 {
	public static void main(String[] args) {
		 int[] numberList = new int[5];
		    int count = 0;
		    Random ran= new Random();
		    int index = 0;
		    while(true){
		    	int r = ran.nextInt(100) + 1;
		        if(r % 2 == 0){
		        	System.out.println(r + " 선택실수");
		        }else{
		        	numberList[index] = r;
		        	index += 1;
		            System.out.println(Arrays.toString(numberList));
		            count += 1;
		            if(count == 5){
		                break;
		            }
		        }
		    }
	}
}
