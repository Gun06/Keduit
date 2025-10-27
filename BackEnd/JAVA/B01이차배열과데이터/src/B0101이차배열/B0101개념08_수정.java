package B0101이차배열;

import java.util.Arrays;

/*
[이차리스트와 수정 연습]
aLists의 앞의값과 뒤으값을 비교해서 값이 더 작은 쪽은 1, 더 큰 쪽은 2로 수정하시오.
단, 서로 같으면 0으로 수정하시오

*/
/*
[출력예시]
[출력예시]
[1, 2]
[2, 1]
[2, 1]
[0, 0]
[1, 2]

 */
public class B0101개념08_수정 {
	public static void main(String[] args) {
	

	    int[][] numberLists = {
	    		{10, 54},
	    		{43, 6},
	    		{23, 4},
	    		{12, 12},
	    		{3, 6}
	    	};
	    
	   for(int i = 0; i < numberLists.length; i++) {
		   if(numberLists[i][0] > numberLists[i][1]) {
			   numberLists[i][0] = 2;
			   numberLists[i][1] = 1;
		   }else if(numberLists[i][0] < numberLists[i][1]) {
			   numberLists[i][0] = 1;
			   numberLists[i][1] = 2;
		   }else {
			   numberLists[i][0] = 0;
			   numberLists[i][1] = 0;
		   }
	   }
	   
	   for(int i = 0; i < numberLists.length; i++) {
		   System.out.println(Arrays.toString(numberLists[i]));
	   }
	   
	}
}
