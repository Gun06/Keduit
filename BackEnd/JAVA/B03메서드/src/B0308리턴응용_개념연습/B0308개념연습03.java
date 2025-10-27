package B0308리턴응용_개념연습;
/*
 	[문제]
		점수가 60점이상인 학생정보를 리턴하는 함수를만드시오.
 		단, 클래스로 만드시오.
 	[정답]
 		1002 이만수 60 
		1003 김성수 90 
 */


class Student230803{
	int number;
	String name;
	int score;
}
public class B0308개념연습03 {
	
	public static Student230803[] getSolution(String[][] arr) {
		Student230803[] studentList = null;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			int score = Integer.parseInt(arr[i][2]);
			if(score >= 60) {
				count += 1;
			}
		}
		
		studentList = new Student230803[count];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			int score = Integer.parseInt(arr[i][2]);
			if(score >= 60) {
				Student230803 st = new Student230803();
				st.number = Integer.parseInt(arr[i][0]);
				st.name = arr[i][1];
				st.score = Integer.parseInt(arr[i][2]);
				studentList[index] = st;
				index += 1;
			}
		}
		
		
		return studentList;
	}
	
	public static void main(String[] args) {
		
		String[][] arr = {
			{"1001" ,"김철수" , "10"},
			{"1002" ,"이만수" , "60"},
			{"1003" ,"김성수" , "90"},
			{"1004" ,"오지호" , "55"},
		};
	
		Student230803[] re = getSolution(arr);
		for(int i = 0; i < re.length; i++) {
			System.out.print(re[i].number + " ");
			System.out.print(re[i].name + " ");
			System.out.print(re[i].score + " ");
			System.out.println();
		}
	}
}
