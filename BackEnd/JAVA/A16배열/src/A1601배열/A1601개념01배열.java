package A1601배열;

/*
	# 배열(array)
		1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
		2. 초기화 
			
			int[] array = null; 
				(1) 배열은 null을 사용한다.
				
			정수는 아래와같이 초기화했다. 
				
			int num = 0; 
				(1)정수는 0으로 초기화한다.
			
		3. 배열할당 
			array = new int[방의개수];
			array = new int[4];
			
		4. 인덱스(index)
			- 0부터 시작하는 방번호(index)가 부여된다. 
			- 특이하게 0부터 시작된다. 
			- 방 번호는 순차적으로 1씩 증가한다.
			예) 
				int[] array = new int[4];
				방 번호는 0, 1, 2, 3
		5. 출력방법 
			배열변수[방번호]
			arr[0]
		
		6. 배열의초기값
			정수형 배열은 자동으로 변수에 0을 저장한다.
		
		
*/
public class A1601개념01배열 {
	public static void main(String[] args) {
		int[] arr = null;  // 초기화
		arr = new int[4];  // 배열할당
		System.out.println(arr[0]); //출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
	
	}
}
