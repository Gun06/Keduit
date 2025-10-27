package A2004리스트와데이터실습_개념연습;
/*
[문제] 
국어 점수가 수학 점수 보다 큰 학생들의
정보를 출력하시오.
*/ 
/*
[정답]
1002 이영희 70 30
*/ 
public class A2004개념연습05 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    

	    
	    for(int i = 0; i < numberList.length; i++){
	    	if(korScoreList[i] > mathScoreList[i]) {
	    		System.out.print(numberList[i] + " ");
	    		System.out.print(nameList[i] + " ");
	    		System.out.print(korScoreList[i] + " ");
	    		System.out.print(mathScoreList[i] + " ");
	    		System.out.println();
	    	}
	        
	    }
	}
}
