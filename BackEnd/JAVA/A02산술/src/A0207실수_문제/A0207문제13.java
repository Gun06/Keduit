package A0207실수_문제;
/*
	[문제]
	가로가 7, 세로가 7인 정사각형 4개와 같은 크기의 정사각형 절반의 넓이 합을 구하시오.
	
	[출력예시]
	220.5
 */
public class A0207문제13 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", 7 * 7 * 4 + 7 * 7 * 0.5));
	}
}
