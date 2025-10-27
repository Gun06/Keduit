package A2001여러개의리스트_개념연습;
/*
[문제]
aList와 bList의 값을 각각 검색해 둘 다 35보다 작은 수이면 "o"를 출력하고,
그렇지 않으면 "x"를 출력하시오.
*/ 
/* 
[출력예시]
x x o x x 
*/
public class A2001개념연습01 {
	public static void main(String[] args) {
		int[] aList = {56,  99, 20, 91, 27};
	    int[] bList = {32, 100, 32, 73, 77};
	    for(int i = 0; i < aList.length; i++){
	        boolean a = aList[i] < 35;
	        boolean b = bList[i] < 35;
	        if(a && b){
	        	System.out.print("o ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
