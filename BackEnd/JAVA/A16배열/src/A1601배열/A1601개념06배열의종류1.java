package A1601배열;


/*
[배열의종류]
배열은 는 정수, 실수, 문자, 문자열 등 다양한 자료형을 함께 저장할 수 있습니다.
*/
public class A1601개념06배열의종류1 {
	public static void main(String[] args) {
		
		int[] intArr = {10 , 20 , 30 , 40};
		
		double[] doubleArr = {1.3 , 4.12 , -10.0 , -23.433};
		
		boolean[] boolArr = {false, false, true, true};
		
		for(int i = 0; i < 4; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(boolArr[i] + " ");
		}
	}
}
