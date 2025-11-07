package A1603배열과수정_문제;

import java.util.Arrays;

/*
[문제]
numberList에서 각 값을 검사하여, 짝수인 경우 해당 값에 1을 더하시오.
*/
/*
[출력예시]
10,43,24,12,52
11,43,25,13,53
*/
public class A1603문제07 {
	public static void main(String[] args) {
int[] numberList = {10, 43, 24, 12, 52};
		  System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i] % 2 == 0){
		            numberList[i] += 1;
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
