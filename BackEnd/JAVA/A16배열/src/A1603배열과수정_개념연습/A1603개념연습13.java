package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 각 값을 자릿수별로 분리한 후, 
자릿수값의 왼쪽과 오른쪽 자릿수를 비교하여 더 큰값으로 변경한 한다.
왼쪽 오른쪽 자릿수가 서로같으면 변경하지않는다.  
리스트 전체를 출력하시오.
*/
/*
[출력예시]
10,43,24,22,52
1,4,4,22,5
*/
public class A1603개념연습13 {
	public static void main(String[] args) {
		int[] numberList = {10, 43, 24, 22, 52};
		System.out.println(Arrays.toString(numberList));
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i] / 10;
	        int b = numberList[i] % 10;
	        if(a > b){
	            numberList[i] = a;
	        }else if(b > a){
	            numberList[i] = b;
	        }
	    }
	    System.out.println(Arrays.toString(numberList));
	}
}
