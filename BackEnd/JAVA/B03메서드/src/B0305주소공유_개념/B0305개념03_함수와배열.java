package B0305주소공유_개념;

import java.util.Arrays;

public class B0305개념03_함수와배열 {
	
	/*
	    일반 변수와 달리 배열은 주소를 공유하기 때문에
	    주소를 복사한 다른 배열이 값을 변경하면
	    원본도 함께 바뀐다.
	*/
	public static void solution(int[] arr) {
		arr[1] = 100;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		solution(arr);
		System.out.println(Arrays.toString(arr));
	}
}
