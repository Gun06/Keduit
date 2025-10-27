package A2004리스트와데이터실습_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제] 
전교생의 총점과 평균을 구하시오.
*/ 
/*
[출력예시]
592
98.67
*/ 
public class A2004개념연습13 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    int totalAll = 0;
	    for(int i = 0; i < numberList.length; i++){
	        int total = korScoreList[i] + mathScoreList[i];
	        totalAll += total;
	    }
	    double avgAll = (double)totalAll / numberList.length;
	    System.out.println(totalAll);
	    System.out.println(String.format("%.2f", avgAll));
	}
}
