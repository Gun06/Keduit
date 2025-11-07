package A1402반복문과개수_문제;
/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중에서,
일의 자리가 5보다 크고, 십의 자리가 8보다 큰 동시에 짝수의 개수를 출력하시오.
*/
/*
[출력예시]
96 98 
2
*/
public class A1402문제10 {
	public static void main(String[] args) {
int count = 0;
	    for(int i = 10; i < 100; i++){
	        int a = i / 10;
	        int b = i % 10;
	        boolean check1 = a > 8 && b > 5;
	        boolean check2 = i % 2 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
