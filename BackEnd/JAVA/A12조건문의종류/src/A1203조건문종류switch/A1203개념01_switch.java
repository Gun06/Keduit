package A1203조건문종류switch;

public class A1203개념01_switch {
	public static void main(String[] args) {
		
		/*	
			[switch 문]
				[1] if문과 거의 유사하나, 
					if 는 == 이외에 >(크다) 와 < (작다) 등을 활용할수있지만,
					switch 문은 오로지 == (같다)만 적용된다.
	
				[3] switch 문의 조건은 case 로 조건을 검사하는데 break를 함께 써줘야한다. 
					break 는 if문의 {} 중괄호 역활이다.
	
				[4] 첫번째 case 문은 if 와 같고, 두번째 case 부터는 if else 와 같다. 
	
				[5] switch 문은 == (같다)만 적용되기때문에, 상태변수를 사용하는식에서 주로 사용한다. 
		*/
	
		int num = 2;
		
		if(num == 1) {
			System.out.println(1);
		} else if(num == 2) {
			System.out.println(2);
		} else if(num == 3) {
			System.out.println(2);
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
		}
		
	}
}
