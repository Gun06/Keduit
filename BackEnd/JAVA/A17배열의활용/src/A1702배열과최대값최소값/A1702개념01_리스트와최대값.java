package A1702배열과최대값최소값;
/*
[리스트와 최대값]
numberList에서 가장 큰 값을 출력해 보겠습니다.
*/
/*
[출력예시]
98
*/
public class A1702개념01_리스트와최대값 {
	public static void main(String[] args) {
		int[] numberList = {87, 11, 45, 98, 23, 34, 56};

	    int max = numberList[0];
	    for(int i = 1; i < numberList.length; i++){
	        if(max < numberList[i]){
	            max = numberList[i];
	        }
	    }
	    System.out.println(max);
	}
}
