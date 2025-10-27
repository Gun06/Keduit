package B1301파일입출력_암기;


public class B1301개념연습02 {
	public static void main(String[] args) {
		 int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    ItemDAO itemDAO = new ItemDAO();
	    itemDAO.setData(arr);
	    itemDAO.printList();
		
	}
}