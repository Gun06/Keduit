package A1603배열과수정_문제;

import java.util.Arrays;

/*
[문제]
numberList에서 일의 자리가 5이상은 10을 더하고 일의 자리를 0으로 수정하고, 
5미만은 일의 자리만 0으로 수정하시오.
*/
/*
[출력예시]
10,43,26,12,52
10,40,30,10,50
*/
public class A1603문제05 {
	public static void main(String[] args) {
int[] numberList = {10, 43, 26, 12, 52};
		 System.out.println(Arrays.toString(numberList) );
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] % 10;
		        int b = numberList[i] / 10;
		        if(a >= 5){
		            b += 1;
		        }
		        numberList[i] = b * 10;
		    }
		    System.out.println(Arrays.toString(numberList) );
	}
}
