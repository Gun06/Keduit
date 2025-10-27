package A2004리스트와데이터실습;

import java.util.Arrays;

/*
1001 이민수 남 10 20 
1002 이영희 여 70 30
1003 김민정 여 64 65
1004 이철민 남 13 87
1005 오만석 남 49 80
1006 최이슬 여 14 90

우리가 흔히 볼수있는 데이터들은 표형태로 표현한다.
위 데이터는 번호, 이름, 성별, 국어점수, 수학점수 까지 총5개이고, 
학생은 총 6명이다.

위데이터를 리스트를 통해 표현할때는 아래와같이 표현할수있다.
데이터 개수만큼 리스트를 사용해서 위표를 표현할수있다.
*/
public class A2004개념01_리스트와데이터 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    for(int i = 0; i < numberList.length; i++) {
	    	System.out.print(numberList[i] + " ");
	    	System.out.print(nameList[i] + " ");
	    	System.out.print(genderList[i] + " ");
	    	System.out.print(korScoreList[i] + " ");
	    	System.out.println(mathScoreList[i] + " ");
	    }  
	}
}
