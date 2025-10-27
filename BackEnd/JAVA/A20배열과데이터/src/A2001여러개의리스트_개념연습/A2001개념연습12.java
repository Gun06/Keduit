package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList, bList, cList 에 100~999 사이의 랜덤숫자 5개를 저장한다.
aList의 백의자리수
bList의 십의자리수
cList의 일의자리수를 모두 더하여 dList에 저장후 출력한다.
dList에서 가장큰수를 출력하시오.
*/ 
/* 
[출력예시]
[647, 506, 268, 986, 270]
[347, 702, 252, 940, 636]
[214, 370, 569, 343, 258]
[17, 11, 16, 23, 9]
23
*/

public class A2001개념연습12 {
	public static void main(String[] args) {
	    int[] aList =  new int[5];
	    int[] bList =  new int[5];
	    int[] cList = new int[5];
	    int[] dList = new int[5];
	    Random ran = new Random();
	    
	    for(int i = 0; i < 5; i++) {
	    	int r1 = ran.nextInt(900) + 100;
	    	int r2 = ran.nextInt(900) + 100;
	    	int r3 = ran.nextInt(900) + 100;
	    	
	    	aList[i] = r1;
	    	bList[i] = r2;
	    	cList[i] = r3;
	    	
	    }
	    
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    System.out.println(Arrays.toString(cList));
	    
	    int total = 0;
	    for(int i = 0; i < 5; i++) {
	    	int a = aList[i] / 100;
	    	int b = aList[i] % 100 / 10;
	    	int c = aList[i] % 10;
	    	int d = a + b + c;
	    	dList[i] = d;
	    }
	    System.out.println(Arrays.toString(dList));
	    
	    int max = dList[0];
	    for(int i = 1; i < dList.length; i++) {
	    	if(max < dList[i]) {
	    		max = dList[i];
	    	}
	    }
	    System.out.println(max);
	}
}
