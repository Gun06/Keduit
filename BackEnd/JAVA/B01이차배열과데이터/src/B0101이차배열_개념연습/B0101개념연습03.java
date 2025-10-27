package B0101이차배열_개념연습;

import java.util.Arrays;
/*
[이차리스트검색과 비교 자리수 연습]
aLists의 첫번째 값과 두번째 값을 비교하여 둘다 백의 자리가 2인수를 출력하시오.
*/ 
/* 
[출력예시]
[1210, 3243]
[1212, 6243]

*/
public class B0101개념연습03 {
	public static void main(String[] args) {
	
		int[][] aLists = {
		              {1210, 3243},
		              {1343, 6692},
		              {1524, 1547},
		              {1212, 6243},
		              {7452, 6171},
		              };

		          for(int i = 0; i < aLists.length; i++){
		              int a = aLists[i][0] % 1000 / 100;
		              int b = aLists[i][1] % 1000 / 100;
		              if(a == 2 && b == 2){
		            	  System.out.println(Arrays.toString(aLists[i]));
		              }
		          }
	}
}
