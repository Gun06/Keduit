package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 10부터 99 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중에서 일의 자리가 십의 자리의 두 배인 숫자만 bList에 추가한 후, 
리스트 전체를 출력하시오.
*/
/*
[출력예시]
[62, 85, 12, 48, 10, 25, 78, 55, 41, 12]
12 48 12 
*/
public class A1604개념연습05 {
	public static void main(String[] args) {
		 int[] aList = new int[10];
		    int[] bList = new int[10];
		    Random ran = new Random();
		    for(int i = 0; i < 10; i++){
		        int r = ran.nextInt(90) + 10;
		        aList[i] = r;
		    }
		    int index = 0;
		    for(int i = 0; i < 10; i++){
		    	int a = aList[i] / 10;
		    	int b = aList[i] % 10;
		    	boolean c = b == a * 2;
		    	
		        if(c){
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
