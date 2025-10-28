package A0502변수와총합_문제;
/*
[문제]
5875의 각각의 자릿수의 합을 구하시오.
*/

/*
[출력예시]
25
*/
public class A0502문제03 {
	public static void main(String[] args) {
		int a = 5875;
	    int b = a / 1000;
	    int c = a % 1000 / 100;
	    int d = a % 100 / 10;
	    int e = a % 10;
	    int f = b + c + d + e;
	    System.out.println(f);
	}
}
