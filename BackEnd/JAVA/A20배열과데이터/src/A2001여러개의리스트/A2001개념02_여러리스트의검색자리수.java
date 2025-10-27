package A2001여러개의리스트;
/*
[이차리스트검색과 비교 자리수 연습]
aList와 bList의 각각의 값을 검색해 둘 다 백의 자리가 2인 수만 출력하시오.
*/ 
/* 
[출력예시]
1210 3243
1212 6243
*/
public class A2001개념02_여러리스트의검색자리수 {
	public static void main(String[] args) {
		int[] aList = {1210, 1343, 1524, 1212, 7452};
	    int[] bList = {3243, 6692, 1547, 6243, 6171};
	    for(int i = 0; i < aList.length; i++){
	    	
	        int a = aList[i] % 1000 / 100;
	        int b = bList[i] % 1000 / 100;
	        if(a == 2 && b == 2){
	        	System.out.print(aList[i] + " " + bList[i]);
	        	System.out.println();
	        }
	    }
	}
}
