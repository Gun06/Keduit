package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 각 값을 자릿수별로 분리한 후, 
각 자리 숫자의 합으로 값을 변경한 다음 리스트 전체를 출력하시오.
*/
/*
[출력예시]
10,43,24,12,52
1,7,6,3,7
*/
public class A1603개념연습10 {
	public static void main(String[] args) {
		 int[] numberList = {10, 43, 24, 12, 52};
		 System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] / 10;
		        int b = numberList[i] % 10;
		        numberList[i] = a + b;
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
