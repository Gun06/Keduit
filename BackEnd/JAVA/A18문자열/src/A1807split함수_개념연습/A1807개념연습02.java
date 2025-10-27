package A1807split함수_개념연습;

public class A1807개념연습02 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            text는 학생5명의 점수를 기록한 데이터이다.
	            전체 평균과 일등의 점수를 출력하시오.
	        [정답]
	            평균 = 30.2
	            일등 점수 = 80
	    */
	
	    String str = "13,32,80,3,23";
	
	
	    String[] token = str.split(",");
	
	    int maxScore = 0;
	    double total = 0;
	    for(int i=0; i<token.length; i++) {
	        int score = Integer.parseInt(token[i]);
	        total += score;
	
	        if(maxScore < score) {
	            maxScore = score;
	        }
	    }
	    double avg = total / token.length;
	    System.out.println("평균 = " + avg);
	    System.out.println("일등 점수 = " + maxScore);

	}

}
