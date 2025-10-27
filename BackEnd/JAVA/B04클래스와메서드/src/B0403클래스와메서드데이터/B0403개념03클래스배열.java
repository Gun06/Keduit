package B0403클래스와메서드데이터;
/*
1001 김철수 1001
1002 이만수 1002
1003 김성수 1003
1004 오지호 1004

 */
class Student{
	int number;
	String name;
	int score;
	
	void init(int number, String name, int score) { 
		this.number = number;
		this.name = name; 
		this.score = score;
	}
	
	void printData() {
		System.out.println(number + " " + name  + " " + this.score);
	}
}


public class B0403개념03클래스배열 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		Student[] studentList = new Student[arr.length];
		for(int i = 0; i < studentList.length; i++) {
			Student st = new Student();
			st.number = Integer.parseInt(arr[i][0]);
			st.name = arr[i][1];
			st.score = Integer.parseInt(arr[i][2]);
			studentList[i] = st;
		}
		
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
		
	}
}
