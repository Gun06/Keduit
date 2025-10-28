package A0303평균_문제;
/*
[문제]
철수네 반 학생은 총 5명이며, 이번 시험에서 각각 10점, 87점, 53점, 65점, 49점을 받았습니다. 
이 중 가장 높은 점수와 가장 낮은 점수를 제외한 나머지 점수들의 평균을 구하여 소수점 두 자리까지 출력하시오.

[출력예시]
55.67
 */
public class A0303문제02 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", (53 + 65 + 49) / 3.0));
	}
}
