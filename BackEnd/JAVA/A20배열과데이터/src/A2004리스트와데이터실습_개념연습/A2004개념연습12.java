package A2004리스트와데이터실습_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제4] 
1등의 번호, 이름을 출력하시오.
만약 여러 명이면 전부 출력하시오.
*/ 
/*
[정답4]
129
1003 김민정 64 65
1005 오만석 49 80
*/ 
public class A2004개념연습12 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    int max = korScoreList[0] + mathScoreList[0];

	    for(int i = 1; i < numberList.length; i++){
	        int total = korScoreList[i] + mathScoreList[i];
	        if(max < total){
	            max = total;
	        }
	    }
	    System.out.println(max);

	    for(int i = 0; i < numberList.length; i++){
	        int total = korScoreList[i] + mathScoreList[i];
	        if(max == total){
	        	
	        	System.out.print(numberList[i] + " ");
	    		System.out.print(nameList[i] + " ");
	    		System.out.print(korScoreList[i] + " ");
	    		System.out.print(mathScoreList[i] + " ");
	    		System.out.println();
	        }
	    }

	}
}
