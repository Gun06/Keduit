package A0301자릿수_개념연습;
/*
[문제]
7951의 각각의 자릿수를 구하시오.

[출력예시]
7
9
5
1
 */
public class A0301개념연습01 {
	public static void main(String[] args) {
		System.out.println(7951 / 1000);
		System.out.println(7951 % 1000 / 100);
		System.out.println(7951 % 100 / 10);
		System.out.println(7951 % 10);
	}
}
