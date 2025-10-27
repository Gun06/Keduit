package A0206소괄호_개념연습;
/*
	[문제]
	다음 보기는 혼합 계산식입니다.
	주어진 데이터를 사용하여 연산의 결과를 출력하는 코드를 작성하고, 각 연산의 결과를 예측하시오.
	
	[보기]
	12 % (9 - 4) + 12     
	-5 + 39 % (8 - 5)       
	(2 - -19) % 5 + 15     
	7 + (6 + 23) % 3 
 */
public class A0206개념연습07 {
	public static void main(String[] args) {
		System.out.println(12 % (9 - 4) + 12);
		System.out.println(-5 + 39 % (8 - 5));
		System.out.println((2 - -19) % 5 + 15);
		System.out.println(7 + (6 + 23) % 3);
	}
}
