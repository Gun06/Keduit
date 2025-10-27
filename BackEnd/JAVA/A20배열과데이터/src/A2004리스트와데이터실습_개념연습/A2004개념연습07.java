package A2004리스트와데이터실습_개념연습;

import java.util.Random;

/*
[문제] 
랜덤으로 학생을 선택하고, 해당 학생 정보를 삭제하시오.
*/ 
/*
[정답]
2
1001 이민수 남 10 20 
1002 이영희 여 70 30 
1004 이철민 남 13 87 
1005 오만석 남 49 80 
1006 최이슬 여 14 90 

*/  
public class A2004개념연습07 {
	public static void main(String[] args) {
		int [] numberList = {    1001,     1002,     1003,     1004,    1005,      1006};
	    String [] nameList = {  "이민수", "이영희",  "김민정", "이철민", "오만석", "최이슬"};
	    String [] genderList = {		"남",    "여",      "여",     "남",    "남",     "여"};
	    int [] korScoreList = {      10,      70,       64,         13,      49,       14};
	    int [] mathScoreList = {      20,      30,       65,         87,      80,       90};
	    
	    Random ran= new Random();
	    int r = ran.nextInt(numberList.length);
	    System.out.println(r);
	    int index = 0;
	    for(int i = 0; i < numberList.length; i++){
	    	if(i != r) {
	    		numberList[index] = numberList[i];
	    		nameList[index] = nameList[i];
	    		genderList[index] = genderList[i];
	    		korScoreList[index] = korScoreList[i];
	    		mathScoreList[index] = mathScoreList[i];
	    		index += 1;
	    	}
	    }
	    
	    
	    
	    for(int i = 0; i < index; i++){
	    	
	    		System.out.print(numberList[i] + " ");
	    		System.out.print(nameList[i] + " ");
	    		System.out.print(genderList[i] + " ");
	    		System.out.print(korScoreList[i] + " ");
	    		System.out.print(mathScoreList[i] + " ");
	    		System.out.println();
	    	
	        
	    }
	}
}
