package A1702배열과최대값최소값;
/*
[리스트와 최소값]
numberList에서 가장 작은 값을 출력해 보겠습니다.
*/
/*
[출력예시]
-78
*/
public class A1702개념02_리스트와최소값 {
	public static void main(String[] args) {
		int[] numberList = {-4, -48, 13, 58, -78};

	    int min = numberList[0];
	    for(int i = 1; i < numberList.length; i++){
	        if(min > numberList[i]){
	        	min = numberList[i];
	        }
	    }
	    System.out.println(min);
	}
}
