package A1605배열과삭제_문제;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
랜덤(1~100)숫자 하나를 저장 후,
랜덤 값보다 큰값은 전부 aList에서 전부 삭제하시오.
*/ 
/*
[출력예시]
[10, 20, 30, 40, 50, 60]
39
10 20 30 
*/
public class A1605문제01 {
	public static void main(String[] args) {
int[] aList = {10, 20, 30, 40, 50, 60};
	System.out.println(Arrays.toString(aList));
	Random ran = new Random();
	int r = ran.nextInt(100) + 1;
	System.out.println(r);
    int index = 0;
    for(int i = 0; i <aList.length; i++) {
    	if(aList[i] <= r){
    		aList[index]= aList[i];
    		index += 1;
    	}
    }
    for(int i = 0; i < index; i++) {
    	System.out.print(aList[i] + " ");
    }
	}
}
