package A1303반복문for;

/*
	[반복문 for를 while로 표현]
		
 */

public class A1303개념03_반복문for를while로표현 {
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 위 for문의 내부는 아래와같은 구조로 만들어졌다고 생각하면 이해하기쉽다. 
		// 단, 위 변수i 는 아래서는 j로 표현한다. 
		{
			int j = 0;
			while(j < 10) {
				System.out.println(j);
				j ++;
			}
		}
		
		int j = 10; // 위에서 j가 소멸하기때문에 재선언이 가능하다.
	}
}
