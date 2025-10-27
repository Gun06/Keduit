package A0901논리와배수_개념연습;
/*
[문제]
4567의 천의 자릿수가 짝수이고, 십의 자릿수가 홀수인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
false    
*/
public class A0901개념연습02 {
	public static void main(String[] args) {
	    int a = 4567;
	    int b = a / 1000;
	    int c = a % 100 / 10;

	    boolean d = b % 2 == 0;
	    boolean e = c % 2 == 1;
	    boolean f = d && e;    
	    System.out.println(f);
	}
}
