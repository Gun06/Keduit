package B0102이차배열과데이터_개념연습;

public class B0102_개념연습05 {
	public static void main(String[] args) {
		
		String[][] data = {
			{"1001" ,"김철수" , "10"},
			{"1002" ,"이만수" , "60"},
			{"1003" ,"김성수" , "90"},
			{"1004" ,"오지호" , "55"},
		};
		for(int i = 0; i < data.length; i++) {			
			System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);			
		}	
		System.out.println("---------------------------------------------------");
		System.out.println("점수가 60점이상인 [학생번호 이름 점수] 출력 : ");
		
		for(int i = 0; i < data.length; i++) {
			int score =  Integer.parseInt(data[i][2]);
			if(score >= 60) {
				System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);
			}
		}
		System.out.println("---------------------------------------------------");
		
		
	}
}
