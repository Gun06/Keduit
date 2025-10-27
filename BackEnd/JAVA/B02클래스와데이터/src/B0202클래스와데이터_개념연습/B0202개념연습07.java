package B0202클래스와데이터_개념연습;

	/*
		"시험문제중 1문제가 전부 정답처리되었다. 학생들 점수를 5점씩 인상하시오"
		단 만점은 점수가 올라가지않는다.
	
	 */
	/*

		1001 김철수 15
		1002 이만수 65
		1003 김성수 100
		1004 오지호 60
	 */

class Student220207{
	int number;
	String name;
	int score;
}
public class B0202개념연습07 {
	public static void main(String[] args) {
		
		String[][] data = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "100"},
				{"1004" ,"오지호" , "55"},
			};
			
		
			Student220207[] stList = new Student220207[data.length];
			for(int i = 0; i < data.length; i++) {		
				Student220207 st = new Student220207();
				st.number = Integer.parseInt(data[i][0]);
				st.name = data[i][1];
				st.score = Integer.parseInt(data[i][2]);
				stList[i] = st;
			}	
			for(int i = 0; i < data.length; i++) {	
				if(stList[i].score < 100) {
					stList[i].score += 5;
					
				}
			}
			for(int i = 0; i < stList.length; i++) {
					System.out.print(stList[i].number + " ");
					System.out.print(stList[i].name + " ");
					System.out.println(stList[i].score);
			}
		
		
		
		
		
	}
}
