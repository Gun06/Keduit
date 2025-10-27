package A0301자릿수_개념연습;
/*
[문제]
6453의 백의 자리와 십의 자리 숫자의 합을 구하시오.

[출력예시]
9
 */
public class A0301개념연습02 {
	public static void main(String[] args) {
		System.out.println(6453 % 1000 / 100 + 6453 % 100 / 10);
	}
}
