package A2004리스트와데이터실습_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제] 
오늘은 영어 시험을 보는 날이다.
0부터 100사이의 랜덤 숫자를 engScoreList에 저장한 후,
국어 성적이 영어 성적보다 낮은 학생의 정보를 삭제하시오.
*/ 
/*
[출력예시]
[10, 70, 64, 13, 49, 14]
[32, 58, 32, 23, 12, 66]
1002 이영희 여 70 30 58 
1003 김민정 여 64 65 32 
1005 오만석 남 49 80 12
*/ 

public class A2004개념연습08 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    
	    int[] engScoreList = new int[numberList.length];
	    
	    Random ran = new Random();
	    
	    for(int i = 0; i < numberList.length; i++) {
	    	engScoreList[i] = ran.nextInt(101);
	    }
	    
	    System.out.println(Arrays.toString(korScoreList));
	    System.out.println(Arrays.toString(engScoreList));
	   
	    int index = 0;
	    for(int i = 0; i < numberList.length; i++){
	    	if(korScoreList[i] >= engScoreList[i]) {
	    		numberList[index] = numberList[i];
	    		nameList[index] = nameList[i];
	    		genderList[index] = genderList[i];
	    		korScoreList[index] = korScoreList[i];
	    		mathScoreList[index] = mathScoreList[i];
	    		engScoreList[index] = engScoreList[i];
	    		index += 1;
	    	}
	    }
	    
	    
	    
	    for(int i = 0; i < index; i++){
	    	
	    		System.out.print(numberList[i] + " ");
	    		System.out.print(nameList[i] + " ");
	    		System.out.print(genderList[i] + " ");
	    		System.out.print(korScoreList[i] + " ");
	    		System.out.print(mathScoreList[i] + " ");
	    		System.out.print(engScoreList[i] + " ");
	    		System.out.println();
	    	
	        
	    }
	}
}
