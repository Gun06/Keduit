package A0407변수와실수_문제;
/*
[문제]
민수, 철수, 영희의 키는 각각 184.4cm, 165.5cm, 160.8cm입니다.
키가 가장 큰 학생과 키가 가장 작은 학생의 키 차이를 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
23.60
*/
public class A0407문제02 {
	public static void main(String[] args) {
		double a = 184.4;
		double b = 160.8;
		double c = a - b;

	    System.out.println(String.format("%.2f", c));
	}
}
