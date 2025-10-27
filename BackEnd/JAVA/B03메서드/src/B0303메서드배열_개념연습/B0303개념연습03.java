package B0303메서드배열_개념연습;


public class B0303개념연습03 {

	public static void solution(String[] name, int[] score) {
		int max = 0;
		int index = 0;
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				index = i;
			}
		}
		System.out.println(name[index] + " " + score[index]);
	}
	
	public static void main(String[] args) {
		/*
         	[문제]
	            아래 배열은 시험점수와 학생이름이다. 
	            일등의 학생이름을 출력해주는 함수를 만드시오.
	        [정답]
	            박민지 92
	    */
		
		String[] name = {"이만수", "김철수", "박민지"};
		int [] score = {54, 32, 92};
		solution(name, score);
	}
}
