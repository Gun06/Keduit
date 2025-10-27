package A2001여러개의리스트;

import java.util.Arrays;

/*
[문제]
aList 와 bList 의 각각의 값의 합이 짝수이면 cList에 2를 저장한다 
aList 와 bList 의 각각의 값의 합이 홀수이면 cList에 1를 저장한다.
*/
/*
[출력예시]
[2,1,1,2,1]
*/
public class A2001개념04_비교큰값저장 {
	public static void main(String[] args) {
		int[] aList = {10, 43, 23, 12, 53};
	    int[] bList = {54,  6,  4, 12, 50};    
	    int[] cList = new int[aList.length];
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] + bList[i];
	        if(a % 2 == 1){
	        	cList[i] = 1;
	        }else{
	        	cList[i] = 2;
	        }
	    }
	    System.out.println(Arrays.toString(cList));
	}
}
