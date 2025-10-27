package A2001여러개의리스트_개념연습;
/*
[문제]
aList와 bList의 각 aList에서 bList의 값을뺀다 결과가 음수일 경우 "o"를 출력하고,
그렇지 않으면, "x"를 출력하시오.
*/ 
/* 
[출력예시]
x x o x x o o o x o
*/
public class A2001개념연습02 {
	public static void main(String[] args) {
		int[] aList = {15, 9, 7, 13, 17, 10, 17, 1, 13,  8};
	    int[] bList = {13, 5, 8, 11, 16, 19, 18, 4, 10, 13};
	    for(int i = 0; i < aList.length; i++){
	    	int a = aList[i] - bList[i];
	        if(a < 0){
	        	System.out.print("o ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
