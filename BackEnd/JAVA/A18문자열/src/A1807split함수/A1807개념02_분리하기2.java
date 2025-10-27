package A1807split함수;

public class A1807개념02_분리하기2 {

	public static void main(String[] args) {
		
	    /*
	        [문제]
	            input에 저장된 암호를 글자의 길이만큼
	            password배열에 한 글자씩 저장 후 출력하시오.
	        [정답]
	            password = q,w,e,r,1,2,3,4
	    */
	
	    String input = "qwer1234";
	
	    String[] passwrod = input.split("");
	    for(int i=0; i<passwrod.length; i++) {
	    	System.out.print(passwrod[i] + " ");
	    }
	}

}
