package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
1부터 8 사이의 랜덤 숫자를 한 개 저장한 후, 
10번 반복하여 랜덤 숫자만큼 랜덤 값을 저장하고, 
나머지 자리는 0으로 채운 후 리스트 전체를 출력하시오.
*/
/*
[출력예시]
7
[7, 7, 7, 7, 7, 7, 7, 0, 0, 0]
*/
public class A1604개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(8) + 1;
		System.out.println(r);

	    int[] numberList = new int[10];
	    for(int i = 0; i < 10; i++){
	        if(i < r){
	        	numberList[i] = r;
	        }else{
	        	numberList[i] = 0;
	        }
	    }
	    System.out.println(Arrays.toString(numberList));
	}
}
