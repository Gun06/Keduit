package B0301메서드_개념;

public class B0301개념02_지역변수 {

	
	
	public static void printNumber() {
		int num = 5;
		System.out.println("printNumber:" + num);
	}
	
	public static void main(String[] args) {
		/*
			[1] main안의 num과 printNumber함수안의 num은 서로 다르다. 
				눈에는 보이지않지만 main안의 num 은 main.num 이라고생각하고, 
				printNumber함수안의num은 printNumber.num이라고 생각하면 이해가쉽다.
			[2] 함수안에 있는 변수를 지역변수라고 한다.
			[3] 보통 함수이름은 동사로 시작한다. 
		 */
		int num = 10; 
		System.out.println("main:" + num);		
		printNumber();
		printNumber();		
		System.out.println("main:" + num);		
	}

}
