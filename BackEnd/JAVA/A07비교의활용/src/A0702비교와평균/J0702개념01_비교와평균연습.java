package A0702비교와평균;

/*
	[비교와 평균 연습]
	철수네 반 학생은 6명입니다. 
	각 학생은 다음과 같은 점수를 받았습니다.
	10점, 87점, 53점, 65점, 49점, 39점
	각 학생의 번호는 1번부터 6번까지 순서대로 부여되었습니다.
	홀수 번호 학생들의 평균 점수와 짝수 번호 학생들의 평균 점수를 비교하시오.
 */

public class J0702개념01_비교와평균연습 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 87;
		int c = 53;
		int d = 65;
		int e = 49;
		int f = 39;

		int g = a + c + e;
		int h = b + d + f;
		double i = g / 3;
		double j = h / 3;
		boolean k = i == j;
		System.out.println(k);	
		
	}
}
