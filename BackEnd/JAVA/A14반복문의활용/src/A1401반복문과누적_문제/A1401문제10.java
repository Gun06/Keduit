package A1401반복문과누적_문제;
/*
[문제]
반복문을 사용하여 100부터 150까지의 숫자 중,
각 자리수 중에 숫자 5가 들어간 숫자들만을 찾아
그 중에서 6의 배수인 숫자들을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
150 
150
*/
public class A1401문제10 {
	public static void main(String[] args) {
		int total = 0;
	    for(int i = 100; i < 151; i++){
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        boolean check1 = a == 5 || b == 5 || c == 5;
	        boolean check2 = i % 6 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            total += i;
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
}