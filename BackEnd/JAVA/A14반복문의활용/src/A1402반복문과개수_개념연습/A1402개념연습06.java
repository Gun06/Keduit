package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 1000부터 2000까지의 숫자 중에서,
16의 배수이면서 백의 자리가 7인 숫자를 모두 출력한 후,  
그 개수도 출력하시오.
*/
/*
[출력예시]
1712 1728 1744 1760 1776 1792 
6
*/
public class A1402개념연습06 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 1000; i < 2001; i++){
	        int a = i % 1000 / 100;
	        boolean check1 = i % 16 == 0;
	        boolean check2 = a == 7;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
