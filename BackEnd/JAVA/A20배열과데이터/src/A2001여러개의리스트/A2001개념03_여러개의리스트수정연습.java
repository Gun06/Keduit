package A2001여러개의리스트;

import java.util.Arrays;

/*
[이차리스트와 수정 연습]
aList 와 bList 를 각각 비교해서 값이 더 작은 쪽은 1, 더 큰 쪽은 2로 수정하시오.
단, 서로 같으면 0으로 수정하시오.
*/ 
/*
[출력예시]
[2, 1, 1, 0, 1]
[1, 2, 2, 0, 2]
*/
public class A2001개념03_여러개의리스트수정연습 {
	public static void main(String[] args) {
		int[] aList = {10, 43, 23, 12, 53};
	    int[] bList = {54,  6,  4, 12, 50};
	    for(int i = 0; i < aList.length; i++){
	        if(aList[i] > bList[i]){
	            aList[i] = 1;
	            bList[i] = 2;
	        }else if(aList[i] < bList[i]){
	            aList[i] = 2;
	            bList[i] = 1;
	        }else{
	            aList[i] = 0;
	            bList[i] = 0;
	        }
	    }
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	}
}
