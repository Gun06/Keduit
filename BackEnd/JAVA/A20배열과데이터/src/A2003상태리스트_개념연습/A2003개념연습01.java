package A2003상태리스트_개념연습;

import java.util.Arrays;

/*
[문제]
    let aList  = [3, 4, 2, 8, 6];
    let bList  = [5, 3, 1, 7, 3];
    let statusList = [2, 1, 3, 2, 1];
    let cList =[]; 

    배열 aList와 bList의 각 자리의 숫자끼리 더하기 또는 빼기 또는 곱하기를 해서 
    배열 cList 저장하려 한다.
    더하기, 빼기, 또는 곱하기는statusList의 값으로 정한다. 
    statusList가 1 이면 더하기 
    statusList가 2 이면 빼기
    statusList가 3 이면 곱하기이다. 
*/ 
/* 
[정답]

[-2, 7, 2, 1, 9]
*/
public class A2003개념연습01 {
	public static void main(String[] args) {
		int[] aList  = {3, 4, 2, 8, 6};
	    int[] bList  = {5, 3, 1, 7, 3};
	    int[] statusList = {2, 1, 3, 2, 1};
	    int[] cList = new int[aList.length]; 
	
	    for(int i = 0; i < aList.length; i++){
	        int a = 0;
	        if(statusList[i] == 1){
	            a = aList[i] + bList[i];
	        }else if(statusList[i] == 2){
	            a = aList[i] - bList[i];
	        }else if(statusList[i] == 3){
	            a = aList[i] * bList[i];
	        }
	        cList[i] = a;
	        
	    }
	    System.out.println(Arrays.toString(cList));
	}
}
