package A1807split함수_개념연습;

import java.util.Arrays;

public class A1807개념연습01 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            str의 내용을 / 기준으로 잘라서 배열에 저장한다.
	            단, 저장할때는 각각의 숫자의 두배를 저장한다.
	        [정답]
	            arr = 22,200,89
	    */
	
	    String str = "11/100/89";
	
	    String[] token = str.split("/");
	    
	    int[] arr = new int[token.length];
	    
	    for(int i=0; i<token.length; i++) {
	        int a = Integer.parseInt(token[i]);
	        int b = a * 2;
	        arr[i] = b;
	    }
	    System.out.println(Arrays.toString(arr));
	


	}

}
