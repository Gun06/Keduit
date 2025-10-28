package A0302총합_문제;
/*
[문제]
312의 각각의 자리수의 합을 구하시오.

[출력예시]
6
 */
public class A0302문제03 {
	public static void main(String[] args) {
		System.out.println(312 / 100 + 312 % 100 / 10 + 312 % 10);
	}
}
