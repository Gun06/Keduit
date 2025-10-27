package A2004리스트와데이터실습_개념연습;
/*
[문제] 
평균 점수가 60점 이상이면 합격이다.
몇 명이 합격했는지 구하시오.
*/ 
/*
[출력예시]
2
*/ 
public class A2004개념연습02 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    int count = 0;
	    for(int i = 0; i < numberList.length; i++) {
	    	int total = korScoreList[i] + mathScoreList[i];
	    	double avg = total / 2.0;
	    	if(avg >= 60) {
	    		count += 1;
	    	}
	    }
	    System.out.println(count);
	}
}
