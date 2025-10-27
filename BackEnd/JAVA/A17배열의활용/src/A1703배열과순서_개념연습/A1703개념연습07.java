package A1703배열과순서_개념연습;

import java.util.Arrays;

/*
[문제]
120의 약수를 aList에 저장합니다.
두 번째 약수부터 세 개만 출력하시오.
*/ 
/*
[출력예시]
1,2,3,4,5,6,8,10,12,15,20,24,30,40,60,120
2 3 4
*/
public class A1703개념연습07 {
	public static void main(String[] args) {
		int num = 120;
	    int[] aList = new int[120];
	    int index = 0;
	    for(int i = 1; i < num + 1; i++){
	        if(num % i == 0){
	            aList[index] = i;
	            index += 1;
	        }
	    }
	    // System.out.println(Arrays.toString(aList));
	    for(int i = 1; i < 4; i++){
	    	System.out.print(aList[i] + " ");
	    }	
	}
}
