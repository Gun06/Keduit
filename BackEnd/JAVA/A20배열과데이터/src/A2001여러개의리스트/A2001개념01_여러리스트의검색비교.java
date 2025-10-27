package A2001여러개의리스트;
/*
[이차리스트검색과 비교 큰 수 연습]
aList과 bList를 각각 비교해서 더 큰 값을 출력하시오.
단, 서로 같으면 "=="을 출력하시오.
*/ 
/*
[출력예시]
54 43 23 == 53  
*/
public class A2001개념01_여러리스트의검색비교 {
	public static void main(String[] args) {
	    int[] aList = {10, 43, 23, 12, 53};
	    int[] bList = {54,  6,  4, 12, 50};
	    for(int i = 0; i < aList.length; i++){
	        if(aList[i] > bList[i]){
	        	System.out.print(aList[i] + " ");
	        }else if(aList[i] < bList[i]){
	        	System.out.print(bList[i] + " ");
	        }else{
	        	System.out.print("== ");
	        }
	    }
	}
}
