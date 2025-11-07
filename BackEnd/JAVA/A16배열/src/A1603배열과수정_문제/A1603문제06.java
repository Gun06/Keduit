package A1603배열과수정_문제;

import java.util.Arrays;

/*
[문제]
numberList에서 십의 자리를 전부 제거한 일의 자리의값으로 변경한 후, 
배열 전체를 출력하시오.
 */
 /*
[출력예시]
2,13,42,10,1,36,4,14
2,3,2,0,1,6,4,4
 */
public class A1603문제06 {
	public static void main(String[] args) {
int[] numberList = {2, 13, 42, 10, 1, 36, 4, 14};
		  System.out.println(Arrays.toString(numberList) );
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i] >= 10){
		            numberList[i] = numberList[i] % 10;
		        }
		    }
		    System.out.println(Arrays.toString(numberList) );
	}
}
