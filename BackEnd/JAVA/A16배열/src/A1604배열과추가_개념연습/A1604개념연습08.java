package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 50부터 99 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중에서 십의 자리가 짝수이고 일의 자리가 홀수인 숫자만 bList에 추가한 후, 
aList와 bList를 출력하시오.
*/
/*
[출력예시]
60,66,61,59,91,73,61,63,61,80
61,61,63,61
*/
public class A1604개념연습08 {
	public static void main(String[] args) {
		int[] aList = new int[10];
	    int[] bList = new int[10];
	    Random ran = new Random();
	    for(int i = 0; i < 10; i++){
	    	int r = ran.nextInt(50) + 50;
	    	aList[i] = r;
	    }
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] / 10;
	        int b = aList[i] % 10;
	        boolean c = a % 2 == 0;
	        boolean d = b % 2 == 1;
	        if(c && d){
	        	bList[index] = aList[i];
	        	index += 1;
	        }
	    }
	    
	    System.out.println(Arrays.toString(aList));
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
