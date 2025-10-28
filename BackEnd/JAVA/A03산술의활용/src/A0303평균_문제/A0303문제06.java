package A0303평균_문제;
/*
[문제]
575의 각각의 자리수의 평균을 구하여 소수점 두 자리까지 출력하시오.

[출력예시]
5.67
 */
public class A0303문제06 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", (575/100 + 575%100/10 + 575%10)/3.0));
	}
}
