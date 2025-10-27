package A0902논리와약수_개념연습;
/*
[문제]
1234의 백의 자릿수가 24의 약수이거나, 십의 자릿수가 24의 약수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
true    
*/
public class A0902개념연습02 {
	public static void main(String[] args) {
	   int a = 1234;
	   int b = a % 1000 / 100;
	   int c =a % 100 / 10;
	   boolean d = 24 % b == 0 || 24 % c == 0;
	    
	   System.out.println(d);
	}
}
