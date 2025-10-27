package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 모든 십의자리를 제거해서 수정하시오.
*/
/*
[출력예시]
10,43,24,12,52
0,3,4,2,2
*/
public class A1603개념연습04 {
	public static void main(String[] args) {
	    int[] numberList = {10, 43, 24, 12, 52};
	    System.out.println(Arrays.toString(numberList) );
	    for(int i = 0; i < numberList.length; i++){
	        numberList[i] = numberList[i] % 10;
	    }
	    System.out.println(Arrays.toString(numberList) );
	}
}
