package A1308반복문거꾸로;

/*
	[거꾸로 반복1]
	지금까지는 반복문을 사용해 숫자를 순차적으로 출력하는 방법을 배웠습니다. 
	이번에는 숫자를 거꾸로 출력하는 연습을 해보겠습니다. 
	4부터 1까지 숫자를 역순으로 출력하는 코드를 작성해 보겠습니다.
 */

/*
	[출력 예시]
	4 
	3 
	2 
	1
 */

public class A1308개념01_거꾸로반복1 {
	public static void main(String[] args) {
		
		int i = 4;
		while(i >= 1) {
			System.out.println(i);
			i -= 1;
		}
		
	}
}
