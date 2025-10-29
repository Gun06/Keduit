package A0704약수_문제;
/*
[문제]
3346에서 백의 자리 숫자가 45의 약수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
true    
*/
public class A0704문제03 {
	public static void main(String[] args) {
		int a = 3346;
		int b = a % 1000 / 100;
		 
		boolean c =  45 %  b == 0;
		System.out.println(c);
	}
}
