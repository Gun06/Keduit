package A0505누적;

/*
	[할당 연산자]
	산술 연산자와 대입 연산자를 결합하여 축약한 형태를 할당 연산자라고 부릅니다.
	할당 연산자는 산술 연산자와 동일한 종류로 존재하며, 연산 후 결과를 다시 변수에 저장할 때 사용합니다.
 */

public class A0505개념04_할당연산자 {
	public static void main(String[] args) {
		
		/*
			[더하기 할당 연산자]
			a += 1 은 a = a + 1 과 같습니다.		 
		 */
		int a = 1;
		a += 1;
		System.out.println(a);
		
		/*
			[빼기 할당 연산자]
			a -= 10 은 a = a - 10 과 같습니다.		 
		 */
		a = 10;
		a -= 1;
		System.out.println(a);
		
		/*
			[곱하기 할당 연산자]
			a *= 10 은 a = a * 10 과 같습니다.	 
		 */
		a = 6;
		a *= 3;
		System.out.println(a);
		
		/*
			[나누기 할당 연산자]
			a /= 10 은 a = a / 10 과 같습니다.		 
		 */
		a = 10;
		a /= 3;
		System.out.println(a);
		
		/*
			[나머지 할당 연산자]
			a %= 3 은 a = a % 3 과 같습니다.	 
		 */			
		a = 11;
		a %= 3;
		System.out.println(a);
		
	}
}
