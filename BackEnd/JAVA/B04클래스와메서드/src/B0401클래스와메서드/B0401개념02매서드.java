package B0401클래스와메서드;

class Test02 {
	
	void printSum() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
}

public class B0401개념02매서드 {
	public static void main(String[] args) {
		
		Test02 t2 = new Test02();
		
		// 1~5의 합을 출력하는 메서드
		t2.printSum();
		
	}
}
