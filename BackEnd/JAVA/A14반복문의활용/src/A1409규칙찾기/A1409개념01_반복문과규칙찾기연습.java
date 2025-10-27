package A1409규칙찾기;

/*
	[반복문과 규칙 찾기 연습]
	반복문을 사용해서 보기와 같이 출력하시오.
	
	[보기]
	0 1 2
	1 2 3
	2 3 4
	3 4 5
	4 5 6
 */

public class A1409개념01_반복문과규칙찾기연습 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println(i + " " + (i + 1) + " " + (i + 2));
		}
			
	}
}
