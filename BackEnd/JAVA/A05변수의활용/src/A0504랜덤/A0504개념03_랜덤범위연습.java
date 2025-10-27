package A0504랜덤;

import java.util.Random;

/*
	[랜덤 범위 연습]
	철수의 시험 점수는 0에서 100 사이이며, 항상 5점 단위로만 나옵니다. 
	예를 들어, 92점은 나올 수 없습니다. 
	철수의 점수를 랜덤으로 출력해 보겠습니다. 
*/

public class A0504개념03_랜덤범위연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(21);
		int b = a * 5;
		
		System.out.println(b);
		
		/*
			0에서 100 사이의 랜덤 점수라고 하면 0에서 100가지 경우의 수가 있다고 생각하기 쉽지만, 
			점수가 5점 단위로만 나오기 때문에 실제로는 0에서 20까지의 경우의 수만 필요합니다. 
			그런 다음, 랜덤으로 선택된 숫자에 5를 곱하여 최종 점수를 결정할 수 있습니다.		 
		 */
		
	}
}
