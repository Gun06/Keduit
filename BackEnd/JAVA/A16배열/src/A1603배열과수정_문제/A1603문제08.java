package A1603배열과수정_문제;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
랜덤으로 10부터 90 사이의 숫자중에서 10단위로 저장한다. 
예) 10, 70
numberList에서 각각의 숫자를 랜덤숫자와 비교한후,
랜덤숫자보다 큰숫자는 십의자리의 제거한숫자로 수정하고 출력하시오.
*/
/*
[출력예시]
10,83,24,62,52
80
10,3,24,62,52
*/
public class A1603문제08 {
	public static void main(String[] args) {
int[] numberList = {10, 83, 24, 62, 52};
		System.out.println(Arrays.toString(numberList));
		Random ran = new Random();
		int r= ran.nextInt(9) + 1;
	    r = r * 10;
	    System.out.println(r);

	    for(int i = 0; i < numberList.length; i++){
	        if(numberList[i] > r){
	            numberList[i] = numberList[i] % 10;
	        }
	    }
	    System.out.println(Arrays.toString(numberList));
	}
}
