package B0402클래스와메서드리턴;

class MethodOverloading{
	
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	int add(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	int add(double f) {
		return 0;
	}

}

public class B0402개념05오버로딩 {
	public static void main(String[] args) {
	
		// overloading 
		// 메서드 오버로딩이란? 메서드를 같은이름으로 만들어도 
		// 전달되는 값이 다르면 서로 다른 메서드로 인식하겠다는 의미 
		
		MethodOverloading mol = new MethodOverloading();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int r1 = mol.add(10, 3);
		int r2 = mol.add(10, 3, 1);
		int r3 = mol.add(arr);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		
	}
}
