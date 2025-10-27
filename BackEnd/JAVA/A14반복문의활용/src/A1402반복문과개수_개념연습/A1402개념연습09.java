package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 10부터 50까지의 숫자 중에서,
십의 자리가 짝수이고, 일의 자리가 홀수인 동시에
3의 배수인 숫자의 개수를 출력하시오.
*/
/*
[출력예시]
21 27 45 
3
*/
public class A1402개념연습09 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 10; i < 51; i++){
	        int a = i / 10;
	        int b = i % 10;
	        boolean check1 = a % 2 == 0 && b % 2 == 1;
	        boolean check2 = i % 3 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
