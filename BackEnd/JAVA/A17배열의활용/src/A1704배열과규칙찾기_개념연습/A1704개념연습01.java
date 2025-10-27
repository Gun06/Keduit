package A1704배열과규칙찾기_개념연습;
/*
[문제]
numberList에서 짝수 인덱스에 해당하는 값만 출력하시오.
*/
/*
[출력예시]
21 12 60 
*/
public class A1704개념연습01 {
	public static void main(String[] args) {
		int[] numberList = {21, 44, 12, 54, 60};
	    for(int i = 0; i < numberList.length; i++){
	        if(i % 2 == 0){
	        	System.out.print(numberList[i] + " ");
	        }
	    }
	}
}
