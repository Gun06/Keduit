package A0404변수와나머지;
/*
'''
[변수와 나머지]
철수는 현금 10000원을 가지고 있습니다. 
만화책 한 권의 가격은 4500원입니다.
철수가 만화책을 최대한 구입한 후에 남은 잔돈이 얼마인지 구해 보겠습니다.
 */
public class A0404개념01_변수와나머지 {
	public static void main(String[] args) {
		int a = 10000;
		int b = 4500;
		int c = a % b;
		System.out.println(c);
	}
}
