package A2001여러개의리스트_개념연습;

import java.util.Arrays;

/* 
[이차리스트와 수정 연습]
a 와 b의 합을 cList에 저장하시오.
그리고 a 와 b의 합을한값에서 반올림한값을 dList에 추가하시오.
*/ 
/* 
[출력예시]
[212, 171, 185, 408, 691]
[719, 480, 252, 168, 537]
[931, 651, 437, 576, 1228]
[930, 650, 440, 580, 1230]
*/
public class A2001개념연습06 {
	public static void main(String[] args) {
		int[] aList = {212, 171, 185, 408, 691};
	    int[] bList = {719, 480, 252, 168, 537};
	    int[] cList = new int[aList.length];
	    int[] dList = new int[aList.length];
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    
	    for(int i = 0; i < aList.length; i++){
	    	int a = aList[i] + bList[i];
	    	cList[i] = a;
	    	int _10 = a / 10;
	    	int _1 = a % 10;
	    	if(_1 >= 5) {
	    		_10 += 1;
	    	}
	    	int b = _10 * 10;
	    	dList[i] = b;
	        
	    }
	    System.out.println(Arrays.toString(cList));
	    System.out.println(Arrays.toString(dList));
	}
}
