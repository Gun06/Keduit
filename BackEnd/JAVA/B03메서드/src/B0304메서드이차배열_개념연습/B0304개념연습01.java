package B0304메서드이차배열_개념연습;

public class B0304개념연습01 {

	public static void solution(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			String[] line = arr[i];
			String a = line[0];
			String b = line[1];
			String c = line[2];
			int d1 = Integer.parseInt(a);
			int d2 = Integer.parseInt(b);
			int d3 = 0;
			if(c.equals("+")) {
				d3 = d1 + d2;
			}
			else if(c.equals("-")) {			
				d3 = d1 - d2;		
			}
			else if(c.equals("*")) {
				d3 = d1 * d2;		
			}
			System.out.println(d3);
		}
	}
	
	public static void main(String[] args) {
		/*
         	 [문제]
	            game배열의 각 가로줄은 한게임을 뜻한다. 
	            첫 번째 숫자와 두 번째 숫자를 더하거나 빼거나 곱해서
	            그 결과를 출력하시오..
	            위 내용을 한줄씩 내려오면 5번 반복하시오.
	        [예시]
	            {"5" , "9" , "+"} 은 5 + 9 이다 
	            {"3" , "7" , "-"}  은 3 - 7 이다 
	            {"8" , "4" , "*"} 는 8 * 4 이다 
	            ...
	            나머지도같은방법으로한다.
	        [정답]
	            14
	            -4
	            32
	            11
	            -2
	    */
		String[][] game = {
				{"5" , "9" , "+"},
				{"3" , "7" , "-"},
				{"8" , "4" , "*"},
				{"9" , "2" , "+"},
				{"4" , "6" , "-"},
		};
		solution(game);
	}
}
