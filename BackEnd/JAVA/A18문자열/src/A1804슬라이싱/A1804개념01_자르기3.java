package A1804슬라이싱;

public class A1804개념01_자르기3 {

	public static void main(String[] args) {
		
	   
		// "010-1234-5678" 전화번호 에서 5678 대신 ****로 수정하시오.
	    // 정답) 010-1234-****
	    String phoneNum = "010-1234-5678";
	    phoneNum = phoneNum.substring(0, phoneNum.length() - 4);
	    phoneNum += "****";
	    System.out.println(phoneNum);
	    
	}

}
