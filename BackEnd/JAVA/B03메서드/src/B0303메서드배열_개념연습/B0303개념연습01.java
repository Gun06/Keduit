package B0303메서드배열_개념연습;


public class B0303개념연습01 {

	public static void solution(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		/*
         	[문제] 
	            arr배열 안의 값들을 체크하여 
	            짝수의 개수를 출력하는 함수를 만드시오.
	        [정답]
	            2
	    */

		int [] arr = {2, 45, 1, 12};
		solution(arr);
	}
}
