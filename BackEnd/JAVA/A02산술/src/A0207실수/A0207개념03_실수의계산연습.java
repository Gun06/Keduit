package A0207실수;
/*
	[실수의 계산 연습]
	사과 한 개의 무게는 140.51g이고, 귤 한 개의 무게는 78.58g입니다.
	이 두 과일의 무게 합을 소수점 두 자리까지 반올림하면 결과는 219.09입니다.
 */
public class A0207개념03_실수의계산연습 {
	public static void main(String[] args) {
		
		System.out.println(140.51 + 78.58);  // 소수점이 길게 표현된다.
		
		System.out.println(String.format("%.02f",  140.51 + 78.58)); // 소수점 두번째 자리까지 표현한다.
	}
}
