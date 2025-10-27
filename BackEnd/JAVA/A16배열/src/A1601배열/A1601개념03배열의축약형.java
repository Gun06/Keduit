package A1601배열;

/*
	[배열의 축약형]
		
		int[] arr = {10, 20, 30, 40}; 
		
		위 배열의 축약형은 아래내용을 한줄로 축약한것이다. 
		int [] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
	[주의]
		축약형은 처음에 한번만 가능하고 두번째는 에러가 발생한다.
*/
public class A1601개념03배열의축약형 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40}; 
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		// 축약형은 한번만 적용된다. 아래 주석을 풀면 에러가 발생한다. 
		//arr = {100, 200, 300, 400}; 
		
	}
}
