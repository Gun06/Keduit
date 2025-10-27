package B0404클래스와DAO;


/*
	[문제] 
		학생 점수를 전부 5점씩 올리시오.
	[정답]
		1001 김철수 15
		1002 이만수 65
		1003 김성수 95
		1004 오지호 60

*/


public class B0404개념02클래스와DAO {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.setData(arr);
		studentDAO.getSolution();
		studentDAO.printList();
	}
}
