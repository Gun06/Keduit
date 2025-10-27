package A1802인덱싱_개념연습;

public class A1802개념연습03 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래 번호 뒷자리를 **** 으로 변경하시오.
	        [결과]
	            Hong's number is 010-1234-****
	
	    */
	    String text = "Hong's number is 010-1234-5678";
	    
	    int size = text.length();
	
	    String temp = "";
	    for(int i = 0; i < size; i++){
	        if(text.length() - 4 > i){
	            temp += text.charAt(i);
	        }else{
	            temp += "*";
	        }
	    }
	    System.out.println(temp);


	}

}
