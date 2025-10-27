package B0202클래스와데이터;

class Member220204{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}


public class B0202개념04_기본이론4 {
	public static void main(String[] args) {
		
		String[][] dataList ={
			{"1001" , "qwer" , "1234", "김철수" , "10"},
			{"1002" , "asdf" , "2345", "이영희" , "30"},
		};	
		
		int size = dataList.length;
		Member220204[] memberList = new Member220204[size];
			
		// 방법2
		for(int i = 0; i < size; i++) {
			memberList[i] = new Member220204();
			
			memberList[i].number = Integer.parseInt(dataList[i][0]);
			memberList[i].id = dataList[i][1];
			memberList[i].pw = dataList[i][2];
			memberList[i].name =  dataList[i][3];
			memberList[i].score = Integer.parseInt(dataList[i][4]);
		}
		
	}
}







