package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[리스트 추가 연습]
aList에 1에서 100 사이의 랜덤 숫자 5개를 추가합니다.
bList에 aList의 값들 중 홀수만 추가한 후, 두 리스트 전체를 출력하시오.
*/
/*
[출력예시]
78,18,40,68,35
35
*/
public class A1604개념연습09 {
	public static void main(String[] args) {
		int[] aList = new int[5];
	    int[] bList = new int[5];
	    Random ran = new Random();
	    for(int i = 0; i < 5; i++){
	    	int r = ran.nextInt(100) + 1;
	    	aList[i] = r;
	    }
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        if(aList[i] % 2 == 1){
	           bList[index] = aList[i];
	        }
	    }
	    System.out.println(Arrays.toString(aList));
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
