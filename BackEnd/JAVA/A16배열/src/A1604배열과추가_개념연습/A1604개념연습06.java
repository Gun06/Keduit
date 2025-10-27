package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 130부터 170 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중에서 각 자리 숫자 중에서 숫자 5가 포함된 숫자만 bList에 추가한 후, 
리스트 전체를 출력하시오.
*/
/*
[출력예시]
[146, 147, 162, 157, 147, 141, 134, 160, 159, 143]
157 159
*/
public class A1604개념연습06 {
	public static void main(String[] args) {
		int[] aList = new int[10];
	    int[] bList = new int[10];
	    Random ran = new Random(); 
	    		
	    for(int i = 0; i < 10; i++){
	        int r = ran.nextInt(41) + 130;
	        aList[i] = r;
	    }
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] / 100;
	        int b = aList[i] % 100 / 10;
	        int c = aList[i] % 10;
	        boolean d = a == 5 || b == 5 || c == 5;
	        if(d){
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
