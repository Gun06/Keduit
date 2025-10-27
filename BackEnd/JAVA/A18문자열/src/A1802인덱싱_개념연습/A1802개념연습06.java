package A1802인덱싱_개념연습;

public class A1802개념연습06 {
	public static void main(String[] args) {
		/*
	        [문제]
	            철수는 비밀번호는 아래와 같다. 
	            철수는 비밀번호를 보호하기 위해 비밀번호 글자 사이사이에 
	            랜덤으로 . 과 , 를 섞어 넣었다.
	            원래 암호룰  result 에 저장하시오.
	        [정답]
	            qwer1234
	    */
	
	    String password = "q..w,e,.r,.1..2..3,4.";
	    String result = "";
	
	    for(int i = 0; i < password.length(); i++){
	        char a = password.charAt(i);
	        if(a == '.' || a == ','){
	            continue;
	        }
	        result += a;
	    }
	    System.out.println(result);
	}
}
