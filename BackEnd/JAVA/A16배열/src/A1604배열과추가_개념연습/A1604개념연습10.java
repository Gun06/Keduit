package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 10부터 99 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중에서 일의자리에서 반올림한수를 bList에 추가하시오.
*/
/*
[출력예시]
80,51,79,36,65,29,43,55,39,79
80,50,80,40,70,30,40,60,40,80
*/
public class A1604개념연습10 {
	public static void main(String[] args) {
		int[] aList = new int[10];
	    int[] bList = new int[10];
	    Random ran = new Random();
	    for(int i = 0; i < 10; i++){
	    	int r = ran.nextInt(90) + 10;
	    	aList[i] = r;
	    }
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] / 10;
	        int b = aList[i] % 10;
	        if(b >= 5){
	            a += 1;
	        }
	        bList[index] = a *10;
	        index += 1;
	    }
	    System.out.println(Arrays.toString(aList));
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
