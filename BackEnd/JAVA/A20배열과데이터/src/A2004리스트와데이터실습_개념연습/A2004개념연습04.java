package A2004리스트와데이터실습_개념연습;
/*
[문제] 
학생 번호가 짝수인 학생의 번호와 이름을 출력하시오.
*/ 
/*
[정답]
1002 이영희
1004 이철민
1006 최이슬
*/ 
public class A2004개념연습04 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    

	    
	    for(int i = 0; i < numberList.length; i++){
	    	if(numberList[i] % 2 == 0) {
	    		System.out.println(numberList[i] + " " + nameList[i]);
	    	
	    	}
	        
	    }
	}
}
