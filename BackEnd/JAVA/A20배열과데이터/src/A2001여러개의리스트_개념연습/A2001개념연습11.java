package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList, bList, cList 에 100~999 사이의 랜덤숫자 5개를 저장한다.
aList의 백의자리수
bList의 십의자리수
cList의 일의자리수를 모두 더하여 total 에  누적한후 출력하시오.
*/ 
/* 
[출력예시]
[960, 821, 738, 930, 753]
[426, 828, 230, 333, 998]
[180, 280, 403, 181, 280]
71
*/

public class A2001개념연습11 {
	public static void main(String[] args) {
	    int[] aList =  new int[5];
	    int[] bList =  new int[5];
	    int[] cList = new int[5];
	    
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
	    	total += d;
	    }
	    System.out.println(total);
	    
	}
}
