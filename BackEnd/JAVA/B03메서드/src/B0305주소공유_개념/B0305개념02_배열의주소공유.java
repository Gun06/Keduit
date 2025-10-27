package B0305주소공유_개념;

import java.util.Arrays;

public class B0305개념02_배열의주소공유 {
	
	/*
	    일반 변수와 달리 배열은 주소를 공유하기 때문에
	    주소를 복사한 다른 배열이 값을 변경하면
	    원본도 함께 바뀐다.
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] temp = arr;
		temp[1] = 100;
		System.out.println(Arrays.toString(arr));
	}
}
