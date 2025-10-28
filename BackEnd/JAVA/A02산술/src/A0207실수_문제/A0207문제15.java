package A0207실수_문제;
/*
	[문제]
	철수네 동네 놀이터는 가로 13.8m, 세로 8.4m 크기입니다. 
	이번에 가로와 세로를 각각 1.5배 늘리는 공사를 하게 되었습니다. 
	공사 후 철수네 동네 놀이터의 넓이를 계산하여 소수점 두 자리까지 출력하시오.
	
	[출력예시]
	260.82
 */
public class A0207문제15 {
	public static void main(String[] args) {
		System.out.println(String.format("%.2f", 13.8 * 1.5 * 8.4 * 1.5));
	}
}
