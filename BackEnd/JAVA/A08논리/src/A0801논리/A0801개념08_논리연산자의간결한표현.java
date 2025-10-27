package A0801논리;

/*
	[논리연산자의 간결한 표현]
	10 더하기 3의 결과가 8보다 크거나 5 더하기 26의 결과가 35보다 큰지 확인하는 식을
	작성해보겠습니다. 논리 연산자는 비교 연산자를 연결하는 연산자이기 때문에 연산 식이 길어지면 
	가독성이 떨어집니다. 
 */

public class A0801개념08_논리연산자의간결한표현 {
	public static void main(String[] args) {
		
		System.out.println(10 + 3 > 8 || 5 + 26 > 35);
		
		int a = 10 + 3;
		int b = 5 + 26;
		
		boolean c = a > 8;
		boolean d = b > 35;
		
		boolean e = c || d;
		System.out.println(e);
		
	}
}
