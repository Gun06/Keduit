package B0303메서드배열_개념;


public class B0303개념01_배열 {

	public static void solution(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 50) {
				System.out.println(arr[i]);					
			}
		}
	}
	
	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열의 값들 중 50보다 큰 수만 출력해주는 함수를 만드시오.
	        [정답]
	            93
				54
				67       
	    */

		int [] arr = {21, 93, 54, 1, 67};
		solution(arr);
	}
}
