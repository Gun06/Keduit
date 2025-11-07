package A1603배열과수정_문제;

import java.util.Arrays;

/*
[문제]
numberList에서 각 자리 중 숫자 5가 포함된 숫자를 찾아, 
해당 숫자들을 모두 'x'으로 변경한 후 리스트 전체를 출력하시오.
*/
/*
[출력예시]
[153, 151, 143, 160, 134, 130, 154, 146, 164, 135]
[0, 0, 143, 160, 134, 130, 0, 146, 164, 0]
*/
public class A1603문제12 {
	public static void main(String[] args) {
int[] numberList = {153, 151, 143, 160, 134, 130, 154, 146, 164, 135};
		System.out.println(Arrays.toString(numberList));
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i] / 10;
	        int b = numberList[i] % 100 / 10;
	        int c = numberList[i] % 10;
	        if(a == 5 || b == 5 || c == 5){
	            numberList[i] =  0;
	        }
	    }
		System.out.println(Arrays.toString(numberList));
	}
}
