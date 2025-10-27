package A1601배열_개념연습;
/*
[문제]
numberList의 값을 전체 출력하되, 각 값을 가로로 나열하여 출력하시오.
*/
/*
[출력예시]
10 20 30 40
*/
public class A1601개념연습01 {
	public static void main(String[] args) {
		int[] numberList = {10, 20, 30, 40};
	    for(int i = 0; i < numberList.length; i++){
	    	System.out.print(numberList[i] + " ");
	    }
	}
}
