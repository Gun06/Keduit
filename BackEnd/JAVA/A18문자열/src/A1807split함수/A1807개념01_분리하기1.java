package A1807split함수;

public class A1807개념01_분리하기1 {

	public static void main(String[] args) {
		/*
	        [개념] 문자열 자르기2
	            let 변수 = "문자열";
	            변수 = 변수.split(구분자);
	
	            문자열을 구분자를 기준으로 잘라서 배열로 만들어준다.
	    */
		
	    String text = "One,Two,Three,Four,Five";
	    String[] arr = text.split(",");
	    
	    for(int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	    }
	  
	}

}
