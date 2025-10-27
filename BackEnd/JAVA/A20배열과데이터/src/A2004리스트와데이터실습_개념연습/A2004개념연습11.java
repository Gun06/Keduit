package A2004리스트와데이터실습_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제] 
각 학생들의 국어점수와 수학점수의 합을 totalList에 저장하시오.
*/ 
/*
[정답]
[30, 100, 129, 100, 129, 104]
*/ 

public class A2004개념연습11 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    int[] totalList = new int[numberList.length];

	    for(int i = 0; i < numberList.length; i++){
	        int total = korScoreList[i] + mathScoreList[i];
	        totalList[i] = total;
	    }
	    System.out.println(Arrays.toString(totalList));
	}
}
