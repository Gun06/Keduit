package A2001여러개의리스트_개념연습;
/*
[문제]
aList와 bList의 값을 각각 검색해 둘 다 홀수일 경우 해당 숫자를 출력하고,
그렇지 않으면, "x"를 출력하시오.
*/ 
/* 
[출력예시]
x
51 69
x
x
55 73
*/
public class A2001개념연습03 {
	public static void main(String[] args) {
		int[] aList = {99, 51, 39, 45, 55};
	    int[] bList = {70, 69, 18, 58, 73};
	    for(int i = 0; i < aList.length; i++){
	    	boolean a = aList[i] % 2 == 1;
	    	boolean b = bList[i] % 2 == 1;
	        if(a && b){
	        	System.out.println(aList[i] + " " + bList[i]);
	        }else{
	        	System.out.println("x ");
	        }
	    }
	}
}
