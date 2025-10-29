package A0801논리_문제;
/*
[문제]
3640의 각 자릿수가 전부 5보다 작은지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
false    
*/
public class A0801문제03 {
	public static void main(String[] args) {
		int a = 3640;
		int b = a / 1000;
	    int c = a % 1000 / 100;
	    int d = a % 100 / 10;
	    int e = a % 10;

	    boolean f = b < 5 && c < 5 && d < 5 && e < 5;
	    System.out.println(f); 
	}
}
