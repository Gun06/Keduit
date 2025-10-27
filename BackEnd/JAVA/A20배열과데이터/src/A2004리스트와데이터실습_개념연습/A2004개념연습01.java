package A2004리스트와데이터실습_개념연습;

import java.util.Random;

/*
[문제]
랜덤으로 학생한명의 정보를 출력하시오.
*/
/*
[출력예시]
1
1002 이영희 여 70 30 
*/
public class A2004개념연습01 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    Random ran = new Random();
	    int r = ran.nextInt(numberList.length);
	    System.out.println(r);
	    System.out.print(numberList[r] + " ");
	    System.out.print(nameList[r] + " ");
	    System.out.print(genderList[r] + " ");
	    System.out.print(korScoreList[r] + " ");
	    System.out.println(mathScoreList[r] + " ");
	   
	}
}
