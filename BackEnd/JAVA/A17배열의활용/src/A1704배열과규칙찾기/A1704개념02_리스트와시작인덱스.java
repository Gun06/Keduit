package A1704배열과규칙찾기;
/*
[리스트와 시작 인덱스]
numberList = [0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0]
numberList의 값들을 순서대로 검색하여, 처음으로 1이 나오는 인덱스를 찾고, 
그 위치부터 리스트 끝까지의 값을 출력해 보겠습니다.
*/
/*
[출력예시]
1 0 0 1 1 0 0 1 0 
*/
public class A1704개념02_리스트와시작인덱스 {
	public static void main(String[] args) {
		int[] numberList = {0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0};
	    int start = 0;
	    for(int i = 0; i < numberList.length; i++){
	        if(numberList[i] == 1){
	            start = i;
	            break;
	        }
	    }
	    for(int i = start; i < numberList.length; i++){
	    	System.out.print(numberList[i] + " ");
	    }
	}
}
