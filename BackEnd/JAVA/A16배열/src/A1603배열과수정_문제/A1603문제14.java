package A1603배열과수정_문제;

import java.util.Arrays;

/*
[문제]
numberList에서 각 값을 자릿수별로 분리한 후, 각 자릿수의 곱을 구하여, 
그 곱이 홀수이면 해당 값을 1로, 짝수이면 2로 변경한 후 리스트 전체를 출력하시오.
*/
/*
[출력예시]
[10, 33, 23, 13, 52]
[2, 1, 2, 1, 2]
*/
public class A1603문제14 {
	public static void main(String[] args) {
int[] numberList = {10, 33, 23, 13, 52};
		  System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] / 10;
		        int b = numberList[i] % 10;
		        int c = a * b;
		        boolean check = c % 2 == 1;
		        if(check){
		            numberList[i] = 1;
		        }else{
		            numberList[i] = 2;
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
