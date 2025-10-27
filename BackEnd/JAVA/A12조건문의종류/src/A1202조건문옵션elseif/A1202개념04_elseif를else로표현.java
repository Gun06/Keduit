package A1202조건문옵션elseif;

/*
	[조건문 옵션 else if를 else로 표현]
	if-else if 구조는 여러 조건을 한 번에 처리할 때 깔끔하고 간결한 코드를 작성할 수 있습니다.
	이를 else로 중첩하여 사용하는 방법도 가능하지만, 복잡한 중첩 구조가 발생할 수 있어
	코드의 가독성이 떨어질 수 있습니다.
 */

public class A1202개념04_elseif를else로표현 {
	public static void main(String[] args) {
		
		int a = 900;
		
		// if - else if구조
		if(a == 800) {
			System.out.println("if(1)");
		} else if(a == 900) {
			System.out.println("else if(2)");
		} else if(a == 900) {
			System.out.println("else if(3)");
		}
		
		// if - else로 변환된 구조
		if(a == 800) {
			System.out.println("1");
		} else {
			if(a == 900) {
				System.out.println("2");
			} else {
				if(a == 900) {
					System.out.println("3");
				}
			}
		}
	}
}
