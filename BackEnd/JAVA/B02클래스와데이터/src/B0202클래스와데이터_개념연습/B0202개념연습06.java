package B0202클래스와데이터_개념연습;

/*
	"점수가 60점이상인 [학생번호 이름 점수] 클래스로 출력 : " 

 */
/*
	1002 이만수 60
	1003 김성수 90

 */

class Student220206{
	int number;
	String name;
	int score;
}
public class B0202개념연습06 {
	public static void main(String[] args) {
		
		
		String[][] data = {
			{"1001" ,"김철수" , "10"},
			{"1002" ,"이만수" , "60"},
			{"1003" ,"김성수" , "90"},
			{"1004" ,"오지호" , "55"},
		};
		
		Student220206[] stList = new Student220206[data.length];
		for(int i = 0; i < data.length; i++) {		
			Student220206 st = new Student220206();
			st.number = Integer.parseInt(data[i][0]);
			st.name = data[i][1];
			st.score = Integer.parseInt(data[i][2]);
			stList[i] = st;
		}	
		for(int i = 0; i < stList.length; i++) {
			if(stList[i].score >= 60) {
				System.out.print(stList[i].number + " ");
				System.out.print(stList[i].name + " ");
				System.out.println(stList[i].score);
			}
		}
		
		
		
		
		
	}
}
