package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 각 자리에 3, 6, 9 중 하나라도 포함되지 않은 숫자는 
0로 변경한 후 리스트 전체를 출력하시오.
*/
/*
[출력예시]
[34, 24, 23, 11, 45, 77, 54, 1, 50, 2]
[34, 0, 23, 0, 0, 0, 0, 0, 0, 0]
*/
public class A1603개념연습11 {
	public static void main(String[] args) {
		 int[] numberList = {34, 24, 23, 11, 45, 77, 54, 1, 50, 2};
		    System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] / 10;
		        int b = numberList[i] % 10;
		        boolean check1 = a != 3 && a != 6 && a != 9;
		        boolean check2 = b != 3 && b != 6 && b != 9;
		        if(check1 && check2){
		            numberList[i] = 0;
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
