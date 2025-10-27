package B0401클래스와메서드_개념연습;

class Test02 {
	void printSum(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
	
	void printSumMultiple4(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		System.out.println(total);
	}
	
	void printCountMultiple4(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	void PrintCountEven(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}

public class B0401개념연습02 {
	public static void main(String[] args) {
	
		int[] arr = { 87, 100, 11, 72, 92 };
		
		Test02 t = new Test02();

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		t.printSum(arr);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		t.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		t.printCountMultiple4(arr);

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		t.PrintCountEven(arr);
		
	}
}
