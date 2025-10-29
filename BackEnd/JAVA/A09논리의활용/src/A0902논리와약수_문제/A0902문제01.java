package A0902논리와약수_문제;
/*
[문제]
36이 12의 배수이고, 124의 약수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
false    
*/
public class A0902문제01 {
	public static void main(String[] args) {
		int a = 36;
	    boolean b = a % 12 == 0 && 124 % a == 0;
	    System.out.println(b);
	}
}
