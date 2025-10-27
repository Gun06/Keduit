package A1203조건문종류switch;

public class A1203개념02_default {
	public static void main(String[] args) {
		
		/*	
			[default]
				스위치문에서 default 는 if 에서의 else 와 같은역활을 한다.
				위치도 항상 가장 아래 위치한다. 
				가장마지막이므로break는 생략 가능하다.
		*/
	
		int num = 2;
		
		if(num == 1) {
			System.out.println(1);
		} else if(num == 2) {
			System.out.println(2);
		} else if(num == 3) {
			System.out.println(2);
		} else {
			System.out.println("없는 값 입니다.");
		}
	
		// break문을 반드시 작성해야 한다.
		switch(num) {
			case 1: 
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3: 
				System.out.println(3);
				break;
			default: 
				System.out.println("없는 값 입니다.");
				// break;
		}
		
	}
}
