package A0703배수_개념연습;
/*
[문제]
3640에서 백의 자리 숫자가 3의 배수인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
true    
*/
public class A0703개념연습02 {
	public static void main(String[] args) {
		int a = 3640;
	    
		boolean b = a % 1000 / 100 % 3 == 0;
	    System.out.println(b);
	    
	}
}
