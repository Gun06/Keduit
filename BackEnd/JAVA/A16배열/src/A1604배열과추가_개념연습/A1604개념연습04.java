package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 100부터 300 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중에서 일의 자리가 십의 자리보다 큰 수만 bList에 저장하시오.
*/
/*
[출력예시]
[104, 154, 182, 200, 247, 194, 198, 143, 158, 126]
104 247 158 126 
*/
public class A1604개념연습04 {
	public static void main(String[] args) {
		int[] aList = new int[10];
	    int[] bList = new int[10];
	    Random ran = new Random();
	    for(int i = 0; i < 10; i++){
	    	int r = ran.nextInt(201) + 100;
	    	aList[i] = r;
	    }
	    System.out.println(Arrays.toString(aList));
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	    	int a = aList[i] % 100 / 10;
	    	int b = aList[i] % 10;
	        boolean c = b > a;
	        if(c){
	        	bList[index] = aList[i];
	        	index += 1;
	        }
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
