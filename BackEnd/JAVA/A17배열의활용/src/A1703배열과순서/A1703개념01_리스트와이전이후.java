package A1703배열과순서;

import java.util.Arrays;

/*
[리스트와 이전 이후]
1부터 100 사이의 랜덤 숫자 10개를 numberList에 저장한 후, 리스트를 출력합니다.
단, 처음부터 순서대로 출력하며, 다음 숫자가 이전 숫자보다 큰 경우 출력은 즉시 종료됩니다.
*/
/*
[출력예시]
[77, 69, 65, 60, 19, 72, 73, 40, 43, 51]
77 69 65 60 19 
*/
public class A1703개념01_리스트와이전이후 {
	public static void main(String[] args) {
		int[] numList = {77,69,65,60,19,72,73,40,43,51};
	    System.out.println(Arrays.toString(numList));
	    int a = numList[0];
	    for(int i = 1; i < numList.length; i++){
	    	System.out.print(a + " ");
	        if(a < numList[i]){
	            break;
	        }else{
	            a = numList[i];
	        }
	    }
	}
}
