package A0703배수_문제;

/*
    [문제]
    3346에서 십의 자리가 짝수인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
    [출력예시]
    true    
*/
public class A0703문제07 {
	public static void main(String[] args) {
		int a = 3346;
	    int b = a % 100 / 10;
	    boolean c = b % 2 == 0;
	    System.out.println(c);
	}
}
