package A0703배수_개념연습;
/*
[문제]
가로가 3이고 세로가 6인 사각형의 넓이가 짝수인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
true    
*/
public class A0703개념연습05 {
	public static void main(String[] args) {
		 int a = 3;
	    int b = 6;
	    int  c = a * b;
	    boolean d = c % 2 == 0;
	    System.out.println(d);
	}
}
