package A2003상태리스트;

import java.util.Arrays;

/*
[문제]
a  = [3, 4, 2, 8, 6]
b  = [5, 3, 1, 7, 3]
op = [2, 1, 2, 2, 1]       
배열 a와 b의 각 자리의 곱을 출력하시오. 
난 op가 1이면 양수로 2이면 음수로 출력하시오.
*/ 
/* 
[정답]
[-15, 12, -2, -56, 18]
*/
public class A2003개념01_상태_시험 {
	public static void main(String[] args) {
		int[] aList  = {3, 4, 2, 8, 6};
	    int[] bList  = {5, 3, 1, 7, 3};
	    int[] statusList = {2, 1, 2, 2, 1};
	    int[] cList = new int[aList.length];    

	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] * bList[i];
	        if(statusList[i] == 1){
	        	cList[i] = a;
	        }else{
	        	cList[i] = -a;
	        }
	    }
	    System.out.println(Arrays.toString(cList));
	}
}
