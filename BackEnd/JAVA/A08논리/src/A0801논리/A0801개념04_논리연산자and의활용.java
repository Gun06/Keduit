package A0801논리;

/*
	[논리연산자 &&(and)의 활용]
	56은 음수가 아니고, 100 보다 작은지 확인하는 식을 작성해보겠습니다.
 */

public class A0801개념04_논리연산자and의활용 {
	public static void main(String[] args) {
		
		int a = 56;
	
		/*
			먼저 음수가 아니라는 것은 양수를 의미하는 것으로 56이 0 이상인지 확인하면 됩니다.
			그리고 100 보다 작은 수는 100 미만의 수를 의미하기 때문에 두 식을 모두 만족하려면
			and 연산자를 활용해 다음과 같이 작성할 수 있습니다.		 
		 */
		boolean b = 0 <= a && a < 100;
		System.out.println(b);
		
	}
}
