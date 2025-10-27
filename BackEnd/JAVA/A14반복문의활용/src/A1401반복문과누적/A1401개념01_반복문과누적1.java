package A1401반복문과누적;

/*
	[반복문과 누적1]
	1 + 2 + 3 + 4 + 5를 계산할 때 왼쪽에서부터 순차적으로 더하기를 진행합니다. 
	먼저 1 + 2를 계산하여 3을 얻고, 그 결과에 3을 더하여 6을 만듭니다.
	이 과정을 마지막 숫자까지 반복하면 최종 결과는 15가 됩니다.
	이렇게 1부터 5까지의 숫자를 순차적으로 더하는 과정을 파이썬 코드로 작성해 보겠습니다.
 */

/*
	[출력예시]
	total = 0 + 1
	total = 1 + 2
	total = 3 + 3
	total = 6 + 4
	total = 10 + 5
	total = 15
 */

public class A1401개념01_반복문과누적1 {
	public static void main(String[] args) {
		
		int total = 0;
		
		System.out.println("total = " + total + " + " + 1);
		total = total + 1;
		
		System.out.println("total = " + total + " + " + 2);
		total = total + 2;
		
		System.out.println("total = " + total + " + " + 3);
		total = total + 3;
		
		System.out.println("total = " + total + " + " + 4);
		total = total + 4;
		
		System.out.println("total = " + total + " + " + 5);
		total = total + 5;
		
		System.out.println("total = " + total);
		
	}
}
