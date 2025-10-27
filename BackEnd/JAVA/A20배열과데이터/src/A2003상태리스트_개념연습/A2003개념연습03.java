package A2003상태리스트_개념연습;

import java.util.Arrays;

/*
[문제]
numberList = [1001, 1002, 1003, 1004, 1005]
statusList  = [true, true, false, false, true]
numberList 배열은 회원 번호 목록이다.
statusList 배열은 회원의 탈퇴 여부 목록이다.   
true 이면 현재 가입되어있는상태, false 이면 탈퇴한 상태이다.     
현재 가입되어있는 회원의 번호들을 aList에 저장하시오. 
*/ 
/* 
[출력예시]
1001 1002 1005 
*/
public class A2003개념연습03 {
	public static void main(String[] args) {
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
	 	boolean[] statusList  = {true, true, false, false, true};
	    int[] aList = new int[numberList.length];
	    
	    int index = 0;
	    for(int i = 0; i < numberList.length; i++){
	        if(statusList[i] == true){
	            aList[index]= numberList[i];
	            index += 1;
	        }
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(aList[i] + " ");
	    }
	}
}
