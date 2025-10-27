package A1704배열과규칙찾기;
/*
[리스트와 사각형 출력]
아래 리스트를 출력 예시와 같이 출력해 보겠습니다.
*/
/*
[출력예시]
1 2 3 
4 5 6 
7 8 9 
*/
public class A1704개념05_리스트와사각형출력 {
	public static void main(String[] args) {
		int[]  numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    for(int i = 0; i < numberList.length; i++){
	    	System.out.print(numberList[i] + " ");
	        if(i % 3 == 2){
	        	System.out.println();
	        }
	    }
	}
}
