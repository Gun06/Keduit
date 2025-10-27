package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 900까지의 숫자 중, 
백의 자리는 3의 배수, 십의 자리는 4의 배수, 일의 자리는 5의 배수인 숫자를 찾고, 출력하시오.
또한 위 조건의 숫자들의 개수를 출력하시오.
단, 각자리수가 0이면 제외합니다.
*/
/*
[출력예시]
345 385 645 685 
4
*/

public class A1402개념연습12 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 100; i < 901; i++){
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        boolean check1 = a % 3 == 0 && b % 4 == 0 && c % 5 == 0;
	        boolean check2 = a != 0 && b != 0 && c != 0;
	        if(check1 && check2){
	        	System.out.print(i + " "); 	        
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
