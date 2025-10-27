package A1803비교_개념연습;

public class A1803개념연습01 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래 단어들중에서 사전순서로 가장빠른글자를 출력하시오.
	        [정답] 
	            child      
	    */

	    String[] arr = {"school", "teacher", "child","father", "love"};
	    String min = arr[0];
	    for(int i = 0; i < arr.length; i++) {
	    	String a = arr[i];
	    	if(a.compareTo(min) < 0) {
	    		min = a;
	    	}
	    }
	    System.out.println(min);

	}

}
