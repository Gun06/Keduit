package B1201벡터_개념;

import java.util.Arrays;
import java.util.Vector;




public class B1201개념06_콜렉션 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		Vector<Student> stList= new Vector<Student>();
		
		for(int i = 0; i < arr.length; i++) {
			int number = Integer.parseInt(arr[i][0]);
			String name = arr[i][1];
			int score = Integer.parseInt(arr[i][2]);
			Student st = new Student(number, name, score);
			stList.add(st);
		}
		
		for(int i = 0; i < stList.size(); i++) {
			stList.get(i).printData();
		}
			
		Student[] stArr = new Student[stList.size()];
		for(int i = 0; i < stList.size(); i++) {
			stArr[i] = stList.get(i);
		}
		
		Arrays.sort(stArr , (a , b)->{
			if(a.getScore() < b.getScore() ) {
				return 1;
			}
			else if(a.getScore() > b.getScore() ) {
				return -1;
			}else {
				return 0;
			}
		});
		System.out.println("--------------------------");
		for(int i = 0; i < stList.size(); i++) {
			stArr[i].printData();
		}
		
	}
}
