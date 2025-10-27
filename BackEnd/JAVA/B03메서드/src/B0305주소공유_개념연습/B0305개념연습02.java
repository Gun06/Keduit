package B0305주소공유_개념연습;

import java.util.Arrays;
import java.util.Random;

public class B0305개념연습02 {

	public static void solution(int[] arr) {
		Random ran = new Random();
		while(true) {
			int a = ran.nextInt(10) + 1;
			int b = ran.nextInt(10) + 1;
			int c = ran.nextInt(10) + 1;
			int total = a + b + c;
			boolean check = a != b && b != c && c != a;
			if(total == 20 && check) {
				arr[0] = a;
				arr[1] = b;
				arr[2] = c;
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		/*
         [문제]
			아래 배열에 랜덤으로 1~10 사이의숫자 3개를 저장한다.
		[조건]
			단, 3개의 숫자의 합은 반드시 20이어야하며, 
			똑같은 숫자는 없어야한다. 
			위치는 상관없다. 
			이 기능을 구현하는 함수를 만드시오.
		[예시1] 
			1, 10, 9 (O)
		[예시2] 
			9, 9, 2 (X)
	    */
		
		int[] number = {0, 0, 0};
		solution(number);
		System.out.println(Arrays.toString(number));
	}
}
