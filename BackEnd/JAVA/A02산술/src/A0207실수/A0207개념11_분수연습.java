package A0207실수;
/*
	[분수 연습]
	사과 15개의 무게가 25/8kg이라고 할 때, 사과 1개의 무게를 소수점 두 자리까지만 출력해 보겠습니다.
 */
public class A0207개념11_분수연습 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", 25.0 / 8 / 15));
	}
}
