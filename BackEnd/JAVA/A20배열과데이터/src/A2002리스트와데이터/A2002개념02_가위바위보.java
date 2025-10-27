package A2002리스트와데이터;

import java.util.Arrays;
/*
[문제]
a가이기면 a저장
b가이기면 b저장
비기면 ab저장 
*/ 
/* 
[출력예시]
[가위, 바위, 가위, 보]
[바위, 바위, 보, 바위]
[b, ab, a, a]
*/
public class A2002개념02_가위바위보 {
	public static void main(String[] args) {
		String[] aList = {"가위", "바위", "가위", "보"};
	    String[] bList = {"바위", "바위", "보", "바위"};
	    String[] cList = new String[aList.length];

	    for(int i = 0; i < aList.length; i++){
	        if(aList[i] == bList[i]){
	        	cList[i] = "ab";
	        }else if(aList[i] == "가위" && bList[i] == "보"){
	        	cList[i] = "a";
	        }else if(aList[i] == "바위" && bList[i] == "가위"){
	            cList[i] = "a";
	        }else if(aList[i] == "보" && bList[i] == "바위"){
	        	cList[i] = "a";
	        }else{
	        	cList[i] = "b";
	        }
	    }
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    System.out.println(Arrays.toString(cList));
	}
}
