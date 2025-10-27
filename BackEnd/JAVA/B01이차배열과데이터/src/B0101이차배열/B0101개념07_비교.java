package B0101이차배열;

/*
[문제]
numberLists 의 왼쪽값과 오른쪽값을 비교하여 더큰숫자를 출력하시오.
서로같으면 "==" 을 출력하시오.

*/
/*
[출력예시]
54
43
23
==
6

 */
public class B0101개념07_비교 {
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
			   System.out.println(numberLists[i][0]);
		   }else if(numberLists[i][0] < numberLists[i][1]) {
			   System.out.println(numberLists[i][1]);
		   }else {
			   System.out.println("==");
		   }
	   }
	}
}
