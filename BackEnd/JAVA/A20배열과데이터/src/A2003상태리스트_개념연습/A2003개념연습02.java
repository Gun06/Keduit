package A2003상태리스트_개념연습;

import java.util.Arrays;

/*
[문제]
let aList = [3, 4, 2, 8, 6, 0];
let statusList = [2, 1, 2, 1, 1, 2];
let bList = [];

aList 의 값들이 5이상인지 5미만인지 검사한다.
statusList의 값들이 1인지 2인지 검사한다. 
statusList의 값이 1 이고 aList 가 5이상이면 bList에 1 저장
statusList의 값이 1 이고 aList 가 5미만이면 bList에 2 저장 
statusList의 값이 2 이고 aList 가 5이상이면 bList에 3 저장 
statusList의 값이 2 이고 aList 가 5미만이면 bList에 4 저장 
*/ 
/* 
[출력예시]
[4, 2, 4, 1, 1, 4]
*/
public class A2003개념연습02 {
	public static void main(String[] args) {
		int[] aList = {3, 4, 2, 8, 6, 0};
	    int[] statusList = {2, 1, 2, 1, 1, 2};
	    int[] bList = new int[aList.length];

	    for(int i = 0; i < aList.length; i++){
	        if(statusList[i] == 1){
	            if(aList[i] >= 5){
	            	bList[i] = 1;
	            }else{
	            	bList[i] = 2;
	            }
	        }else if(statusList[i] == 2){
	            if(aList[i] >= 5){
	            	bList[i] = 3;
	            }else{
	            	bList[i] = 4;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(bList));
	}
}
