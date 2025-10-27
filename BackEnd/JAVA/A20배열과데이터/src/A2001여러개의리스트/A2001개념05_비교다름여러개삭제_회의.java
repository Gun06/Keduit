package A2001여러개의리스트;
/* 
[문제]
aList와 bList의 값을 각각 비교하여
서로 다르면 모두 삭제하여 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
1 1 1 0 0 1 
1 1 1 0 0 1 
*/
public class A2001개념05_비교다름여러개삭제_회의 {
	public static void main(String[] args) {
		int[] aList = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0};
	    int[] bList = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
	    int index = 0;
	    for(int i = 0; i < aList.length; i++) {
	    	if(aList[i] == bList[i]) {
	    		aList[index] = aList[i];
	    		bList[index] = bList[i];
	    		index += 1;
	    	}
	    }
	    
	    for(int i = 0; i < index; i++) {
	    	System.out.print(aList[i] + " ");
	    }
	    
	    System.out.println();
	    
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
