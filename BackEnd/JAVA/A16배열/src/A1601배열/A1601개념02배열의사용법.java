package A1601배열;

/*
	
		[배열의사용법]
		
*/
public class A1601개념02배열의사용법 {
	public static void main(String[] args) {
		int[] arr = null;  // 선언과 초기화
		arr = new int[4];  // 배열할당
		
		System.out.println(arr[0]); //출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr[0]); // 값이 변경되었다. 
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}
}
