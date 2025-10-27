package B0401클래스와메서드_개념연습;

class Test01 {
	void printEvenOrOdd(int x) {
		if(x % 2 == 1) {
			System.out.println("홀수");
		}
	}
	
	void sumBetweenValues(int x, int y) {
		int total = 0;
		for(int i=x; i<=y; i++) {
			total += i;
		}
		System.out.println(total);
	}

	
}

public class B0401개념연습01 {
	public static void main(String[] args) {
		
		Test01 test = new Test01();
		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		test.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		
		
	}
}
