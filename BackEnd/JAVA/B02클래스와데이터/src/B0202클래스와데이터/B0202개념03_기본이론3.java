package B0202클래스와데이터;

class Member220203{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}


public class B0202개념03_기본이론3 {
	public static void main(String[] args) {
		
		String[][] dataList ={
			{"1001" , "qwer" , "1234", "김철수" , "10"},
			{"1002" , "asdf" , "2345", "이영희" , "30"},
		};	
		
		int size = dataList.length;
		Member220203[] memberList = new Member220203[size];
		
		// 방법1
		for(int i = 0; i < size; i++) {
			Member220203 m = new Member220203();
			m.number = Integer.parseInt(dataList[i][0]);
			m.id = dataList[i][1];
			m.pw = dataList[i][2];
			m.name =  dataList[i][3];
			m.score = Integer.parseInt(dataList[i][4]);
			
			memberList[i] = m;
		}
		
	
		
	}
}







