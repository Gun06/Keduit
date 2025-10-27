package A1704배열과규칙찾기_개념연습;

import java.util.Random;

/*
[문제]
2부터 10 사이의 랜덤 숫자를 저장한 후, 
그 숫자만큼 반복을 하면서 "0 1 2"를 순차적으로 반복하여 
numberList에 저장하고, 리스트 전체를 출력하시오.
*/
/*
[출력예시]
8
[0, 1, 2, 0, 1, 2, 0, 1]
*/
public class A1704개념연습03 {
	public static void main(String[] args) {
		int[] numberList = new int[1000];
		int index =0;
		Random ran = new Random();
		int r = ran.nextInt(9) + 2;
		System.out.println(r);
	    int num = 0;
	    for(int i = 0; i < r; i++){
	        numberList[index] = num;
	        index += 1;
	        num += 1;
	        if(num == 3){
	            num = 0;
	        }
	    }
	    for(int i =0; i < index; i++) {
	    	System.out.print(numberList[i] + " ");
	    }
	}
}
