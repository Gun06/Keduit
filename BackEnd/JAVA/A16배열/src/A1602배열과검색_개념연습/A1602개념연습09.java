package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소 중, 십의 자리가 2인 수만 출력하시오.
*/
/*
[출력예시]
423 124 23 122 
*/
public class A1602개념연습09 {
	public static void main(String[] args) {
		int[] numberList = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	    
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a % 100 / 10;
	        boolean check = a1 == 2;
	        if(check){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
