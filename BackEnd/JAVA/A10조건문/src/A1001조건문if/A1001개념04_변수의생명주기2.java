package A1001조건문if;

/*
	중괄호 안에서 소멸된 변수는
	이후 다시 선언할 수 있다.
*/

public class A1001개념04_변수의생명주기2 {
	public static void main(String[] args) {
		
		int x = 10;
		
		{
			int y = 20;
		}
		
		// 변수 y는 위에서 이미 소멸했으므로 다시 만들 수 있다.
		int y = 30;
		System.out.println(y);
		
	}
}
