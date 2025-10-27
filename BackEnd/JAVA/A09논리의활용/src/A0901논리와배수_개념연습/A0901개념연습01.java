package A0901논리와배수_개념연습;
/*
[문제]
56이 4의 배수이거나, 6의 배수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
true    
*/
public class A0901개념연습01 {
	public static void main(String[] args) {
	    int a = 56;
	    boolean b = 0 <= a && a < 100;
	    System.out.println(b);
	}
}
