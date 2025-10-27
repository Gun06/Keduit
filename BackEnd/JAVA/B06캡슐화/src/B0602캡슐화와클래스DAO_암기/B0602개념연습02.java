package B0602캡슐화와클래스DAO_암기;

/*
[문제]
대구 지역이 폐업하게 되었습니다.
대구 지역의 지역정보를 대전지역으로 변경하시오.
[출력예시]
1001 김환자 19900115 010 1234 0001 10
1002 이환자 19871224 010 4328 0002 40
1003 박환자 19650311 010 1215 0003 20
1004 신환자 19741115 010 8329 0004 10
1005 정환자 19580623 010 0947 0005 30
1006 최환자 19820514 010 5728 0006 40
1007 허환자 19480821 010 6288 0007 20
-----------------
1001 김환자 19900115 010 1234 0001 10
1002 이환자 19871224 010 4328 0002 30
1003 박환자 19650311 010 1215 0003 20
1004 신환자 19741115 010 8329 0004 10
1005 정환자 19580623 010 0947 0005 30
1006 최환자 19820514 010 5728 0006 30
1007 허환자 19480821 010 6288 0007 20
*/

class Patient {
	int number;
	String name;
	String birth;
	String phone1;
	String phone2;
	String phone3;
	String location;
	
	void init(int number, String name, String birth, String phone1, String phone2, String phone3 , String location) {
		this.number = number;
		this.name = name;
		this.birth = birth;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.location = location;
	}
	
	void setLocation(String location) {
		this.location = location;
	}
	String getLocation() {
		return this.location;
	}
	
	void printData() {
		String msg = this.number + " " + this.name + " " + this.birth + " " + this.phone1 + " " + this.phone2 + " ";
		msg += this.phone3 + " ";
		msg += this.location;
		System.out.println(msg);
	}
}

class PatientDAO{
	Patient[] patientList = null;
	
	void setData(String[][] arr) {
		patientList  = new Patient[arr.length];
	    
	    for(int i = 0; i < patientList.length; i++) {
	    		Patient pa = new Patient();
	    		int number = Integer.parseInt(arr[i][0]);
	    		
	    		pa.init(number, arr[i][1],  arr[i][2],  arr[i][3],  arr[i][4],  arr[i][5],  arr[i][6]);
	    		patientList[i] = pa;
	    		
	    }
	}
	void printList() {
		  for(int i = 0; i < patientList.length; i++) {
		    	patientList[i].printData();
		    }
	}
	
	void getSolution() {
	    
	    for(int i = 0; i < patientList.length; i++) {
	    	if(patientList[i].getLocation().equals("40")) {
	    		patientList[i].setLocation("30");
	    	}
	    	
    		
	    }
	}
}


public class B0602개념연습02 {
	
	public static void main(String[] args) {
		 /*
        [지역 정보]
        10 (서울) 20 (경기) 30 (대전) 40 (대구)
		  */

	    String[][] arr = {
		    {"1001", "김환자", "19900115", "010", "1234", "0001", "10"},
		    {"1002", "이환자", "19871224", "010", "4328", "0002", "40"},
		    {"1003", "박환자", "19650311", "010", "1215", "0003", "20"},
		    {"1004", "신환자", "19741115", "010", "8329", "0004", "10"},
		    {"1005", "정환자", "19580623", "010", "0947", "0005", "30"},
		    {"1006", "최환자", "19820514", "010", "5728", "0006", "40"},
		    {"1007", "허환자", "19480821", "010", "6288", "0007", "20"}
    	};
	    PatientDAO patientDAO = new PatientDAO();
	    patientDAO.setData(arr);
	    patientDAO.printList();
	    
	    patientDAO.getSolution();
	    System.out.println("-----------------");
	    patientDAO.printList();
	}
}
