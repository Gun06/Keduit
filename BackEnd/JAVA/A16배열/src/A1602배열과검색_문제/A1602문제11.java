package A1602배열과검색_문제;
/*
[문제]
numberList의 각 요소 중, 일의 자리가 십의 자리의 두 배인 수를 출력하시오.
*/
/*
[출력예시]
24 36 12 48
*/
public class A1602문제11 {
	public static void main(String[] args) {
int[] numberList = {87, 24, 80, 50, 36, 35, 13, 56, 12, 48};
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 10;
	        int a2 = a % 10;
	        boolean check = a2 == a1 * 2;
	        if(check){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
