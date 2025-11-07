package A1604배열과추가_문제;

import java.util.Arrays;

/*
[문제]
aList에 50부터 1까지 거꾸로 추가합니다.
aList의 값들 중에서 3, 6, 9가 포함되지 않은 짝수만 bList에 추가한 후, 리스트 전체를 출력하시오.
*/
/*
[출력예시]
[50, 48, 44, 42, 40, 28, 24, 22, 20, 18, 14, 12, 10, 8, 4, 2]
*/
public class A1604문제07 {
	public static void main(String[] args) {
int[] aList = new int[50];
	    int[] bList = new int[50];
	    int num = 50;
	    for(int i = 0; i < 50;  i++){
	        aList[i] = num;
	        num -= 1;
	    }
	    int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] / 10;
	        int b = aList[i] % 10;
	        if(aList[i] % 2 == 0){
	            boolean c = a != 3 && a != 6 && a != 9;
	            boolean d = b != 3 && b != 6 && b != 9;
	            if(c && d){
	            	bList[index] = aList[i];
	            	index += 1;
	            }
	        }
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
