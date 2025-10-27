package A1705배열과무한반복_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
11부터 99 사이의 랜덤 숫자 중, 각 숫자의 십의 자리와 일의 자리가 짝수인 숫자만 numberList에 저장하시오.
numberList에는 총 3개의 숫자를 저장한 후, 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
[86, 68, 22]
*/
public class A1705개념연습05 {
	public static void main(String[] args) {
	    int[] numberList = new int[3];
	    int count = 0;
	    int index = 0;
	    Random ran = new Random();
	    while(true){
	    	int r = ran.nextInt(90) + 10;
	    	int a = r / 10;
	    	int b = r % 10;
	        boolean check = a % 2 == 0 && b % 2 == 0;
	        if(check){
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
