package A1804슬라이싱_개념연습;

public class A1804개념연습02 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            아래는 학생과 점수 데이터이다.
	            시험점수는 60점이상 합격이다.
	            
	            합격한 사람  점수를 문자열에 저장해서 출력하시오.
	            단, 데이터구분자는 ,(콤마)를 중간에 삽입한다.
	        [정답]
	            result = 92,63
	    */
	
	    int[] scoreList = {12, 92, 54, 63};
	    String result = "";
	
	    for(int i=0; i<scoreList.length; i++) {
	        if(scoreList[i] >= 60) {
	            result += scoreList[i];
	            result += ",";
	        }
	    }
	    
	    System.out.println(result);
	    result = result.substring(0, result.length() - 1);
	    System.out.println(result);

	}

}
