package A0704약수_개념연습;
/*
[문제]
3346에서 일의 자리 숫자가 45의 약수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
false    
*/
public class A0704개념연습01 {
	public static void main(String[] args) {
		 int a = 3346;
		    boolean b =  45 % (a % 10) == 0;
		    System.out.println(b);
	}
}
