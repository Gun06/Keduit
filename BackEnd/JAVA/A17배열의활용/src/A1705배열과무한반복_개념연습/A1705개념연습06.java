package A1705배열과무한반복_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
11부터 99 사이의 랜덤 숫자 중, 십의 자리와 일의 자리 숫자의 차이가 1인 숫자만 
numberList에 3개 저장한 후, 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
32,12,34
*/
public class A1705개념연습06 {
	public static void main(String[] args) {
		int[] numberList = new int[3];
	    int count = 0;
	    int index = 0;
	    Random ran = new Random();
	    while(true){
	    	int r = ran.nextInt(89) + 11;
	    	int a = r / 10;
	    	int b = r % 10;
	    	int c = a- b;
	        if(c == 1 || c == -1){
	            numberList[index] = r;
	            index += 1;
	            count += 1;
	            if(count == 3){
	                break;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(numberList));
	}
}
