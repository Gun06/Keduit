package A0604비교와실수;

/*
	[비교와 실수 연습]
	민수는 키가 184.4cm이고, 철수는 키가 165.5cm이며, 영희는 키가 160.8cm입니다.
	가장 키가 큰 학생과 중간 학생의 키 차이, 
	그리고 중간 학생과 가장 작은 학생의 키 차이가 같은지 비교하시오.
*/

public class A0604개념01_비교와실수연습 {
	public static void main(String[] args) {
		
		double a = 184.4;
		double b = 165.5;
		double c = 160.8;
		
		double d = a - b;
		double e = b - c;
		boolean f = d == e;
		
		System.out.println(String.format("%.1f", d) + " " + String.format("%.1f", e));
		System.out.println(f);
		
	}
}
