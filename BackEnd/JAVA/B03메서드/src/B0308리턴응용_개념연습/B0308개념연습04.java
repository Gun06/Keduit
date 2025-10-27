package B0308리턴응용_개념연습;

/*
	[문제]
	거주지가 서울인 환자 정보를 출력하시오.
	[출력예시]
	1001 김환자 19900115 010 1234 0001 10
	1004 신환자 19741115 010 8329 0004 10
*/

class Patient230804 {
	int number;
	String name;
	String birth;
	String phone1;
	String phone2;
	String phone3;
	String location;
}


public class B0308개념연습04 {
	
	public static  Patient230804 [] getSolution(String[][] arr) {
		Patient230804[] patientList = null;
		    int count = 0;
		    for(int i = 0; i < arr.length; i++) {
		    	if(arr[i][6].equals("10")) {
		    		count += 1;
		    	}
		    	
		    	
		    }
		    patientList = new Patient230804[count];
		    int index = 0;
		    
		    for(int i = 0; i < arr.length; i++) {
		    	if(arr[i][6].equals("10")) {
		    		Patient230804 pa = new Patient230804();
		    		pa.number = Integer.parseInt(arr[i][0]);
			    	pa.name = arr[i][1];
			    	pa.birth = arr[i][2];
			    	pa.phone1 = arr[i][3];
			    	pa.phone2 = arr[i][4];
			    	pa.phone3 = arr[i][5];
			    	pa.location = arr[i][6];
			    	
			    	patientList[index] =pa;
			    	index += 1;
		    	}
		    	
		    	
		    }
		
		return patientList;
	}
	
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
	    Patient230804[] patientList  = getSolution(arr);
	    
	    for(int i = 0; i < patientList.length; i++) {
	    		System.out.print(patientList[i].number + " ");
	    		System.out.print(patientList[i].name + " ");
	    		System.out.print(patientList[i].birth + " ");
	    		System.out.print(patientList[i].phone1 + " ");
	    		System.out.print(patientList[i].phone2 + " ");
	    		System.out.print(patientList[i].phone3 + " ");
	    		System.out.print(patientList[i].location + " ");
	    		System.out.println();
	    		
	    }
	    
		
	}
}
