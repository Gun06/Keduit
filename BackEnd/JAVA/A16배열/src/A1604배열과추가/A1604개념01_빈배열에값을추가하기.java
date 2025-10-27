package A1604배열과추가;

public class A1604개념01_빈배열에값을추가하기 {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		int arrIndex = 0;
		
		arr[arrIndex] = 10;
		arrIndex += 1;
		
		for(int i = 0; i < arrIndex;  i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------");
		
		
		arr[arrIndex] = 20;
		arrIndex += 1;
		
		for(int i = 0; i < arrIndex;  i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------");
	}
}
