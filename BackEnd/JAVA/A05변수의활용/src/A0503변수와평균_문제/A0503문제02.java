package A0503변수와평균_문제;
/*
[문제]
철수네 반 학생은 총 5명이며, 이번 시험에서 각각 10점, 87점, 53점, 65점, 49점을 받았습니다. 
각 학생의 번호가 1번, 2번, 3번, 4번, 5번일 때, 홀수 번호 학생들의 평균을 구하여 소수점 두 자리까지 출력하시오.          
*/

/*
[출력예시]
37.33
*/
public class A0503문제02 {
	public static void main(String[] args) {
		double a = 10;
	    double b = 87;
	    double c = 53;
	    double d = 65;
	    double e = 49;
	    double f = (a + c + e) / 3;

	   System.out.println(String.format("%.2f", f));
	}
}
