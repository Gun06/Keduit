package B0403클래스와메서드데이터;


/*
	[문제] 
		학생 점수를 전부 5점씩 올리시오.
  	[정답]
		1001 김철수 15
		1002 이만수 65
		1003 김성수 95
		1004 오지호 60
 */

public class B0403개념04클래스배열 {
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
			studentList[i].score += 5;
		}
			
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
	}
}
