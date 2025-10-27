package A1102추가계산;

import java.util.Random;

/*
	[추가 계산 연습]
	대부분은 일반적인 경우의 결과가 나오지만,
	특정조건에서 결과가 바뀌게 되는 경우가 있습니다. 
	일반결과에서 추가계산을 해야되는 경우를 살펴보겠습니다. 
	
	볼펜 한 개의 가격은 1200원입니다.
	볼펜을 20개 이상 구매할 경우, 구매한 전체 볼펜에 대해 개당 100원을 할인해줍니다.
	볼펜 수를 10부터 30사이의 랜덤 숫자로 저장하고,
	철수가 지급해야 하는 총 금액을 출력하시오.
	
	위의경우 일반적으로는 볼펜이 1200원이지만 특정조건에서는 1100이 됩니다. 
 */

/*
	[출력예시]
	28
	1100
	30800
	
	[출력예시]
	19
	1200
	22800
 */

public class A1102개념01_추가계산연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = 1200;
		int b = ran.nextInt(21) + 10; 
		System.out.println(b);
		
		// 볼펜 가격이 처음에는 1200이었지만, 볼펜 수가 20이상이면 1100으로 줄어듭니다.
		if(b >= 20) {
			a = a - 100;
		}
		System.out.println(a);
		
		int c = b * a;
		System.out.println(c);
		
	}
}
