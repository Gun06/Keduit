package A0205혼합계산_문제;
/*
	[문제]
	다음 보기는 혼합 계산식입니다.
	주어진 데이터를 사용하여 연산의 결과를 출력하는 코드를 작성하고, 각 연산의 결과를 예측하시오.
	
	[보기]
	2 + 4 * 1 - -2
	3 - -7 * 3 + 12        
	-80 + 81 // 3 - 3       
	-2 - 72 // 6 + 9       
	-5 + 4 % 7 - 6          
	-7 - 24 % 5 + 5
 */
public class A0205문제04 {
	public static void main(String[] args) {
		System.out.println(2 + 4 * 1 - -2 );
		System.out.println(3 - -7 * 3 + 12);
		System.out.println(-80 + 81 / 3 - 3);
		System.out.println(-2 - 72 / 6 + 9);
		System.out.println(-5 + 4 % 7 - 6);
		System.out.println(-7 - 24 % 5 + 5);
	}
}
