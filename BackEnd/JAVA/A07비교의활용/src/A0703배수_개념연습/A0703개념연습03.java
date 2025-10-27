package A0703배수_개념연습;
/*
[문제]
3340에서 십의 자리 숫자가 3의 배수인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
false   
*/
public class A0703개념연습03 {
	public static void main(String[] args) {
		int a = 3340;
	    boolean b = a % 100 / 10 % 3 == 0;
	    System.out.println(b);
	}
}
