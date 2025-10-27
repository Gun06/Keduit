package A1806대문자소문자;

public class A1806개념01_대소문자변환 {

	public static void main(String[] args) {
		 /*
	        [문제]
	        	철수의 회원가입 아이디는 AbCd1234 이다.
	        	로그이을 할려고한다. 이사이트는 대소문자를 구분하지않는다.
	        	철수가 올바르게 입력했는지 판단하시오.
	        	올바르면 o , 아니면 x를 출력하시오.
	    */
		/*
		 	x o o 
		 */
	    String joinId = "AbCd1234";
	
	    String[] chulsuList = { "AbCd1233" , "abcd1234" , "aBcD1234"};
	    for(int i = 0; i < chulsuList.length; i++) {
	    	String a = chulsuList[i];
	    	String b = a.toLowerCase();
	    	String c = joinId.toLowerCase();
	    	
	    	if(b.equals(c)) {
	    		System.out.print("o ");
	    	}else {
	    		System.out.print("x ");
	    	}
	    }
	    
	

	}

}
