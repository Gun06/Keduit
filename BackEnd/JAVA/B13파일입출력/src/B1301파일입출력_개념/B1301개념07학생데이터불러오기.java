package B1301파일입출력_개념;
/*
1001 김철수 1001
1002 이만수 1002
1003 김성수 1003
1004 오지호 1004

 */
public class B1301개념07학생데이터불러오기 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.loadData();
		studentDAO.printList();
	}
}
