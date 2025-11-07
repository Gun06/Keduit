package A1402반복문과개수_문제;
/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중에서,
일의 자리가 십의 자리의 두 배이고,
십의 자리가 홀수인 숫자의 개수를 출력하시오.
*/
/*
[출력예시]
12 36 
2
*/
public class A1402문제08 {
	public static void main(String[] args) {
int count = 0;
	    for(int i = 10; i < 100; i++){
	        int a = i / 10;
	        int b = i % 10;
	        boolean check1 = b == a *2;
	        boolean check2 = a % 2 == 1;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
