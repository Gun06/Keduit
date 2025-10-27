package B0303메서드배열_개념연습;


public class B0303개념연습04 {

	public static void solution(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
			}
		}
		
		if(count == arr.length) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		/*
         	[문제]
				배열의 랜덤값이 모두 짝수면 true를 출력하고,
				하나라도 짝수가 아니면 false를 출력하는 함수를 만드시오.
				단, 0은 짝수이다.
			[정답]
				true
	    */
		
		int [] arr = {10, 0, 2, 6};
		solution(arr);
	}
}
