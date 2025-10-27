package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 150까지의 숫자 중, 
각 자리에 숫자 5가 포함되고, 그 중 6의 배수인 숫자의 개수를 출력하시오.
*/
/*
[출력예시]
150 
1
*/
public class A1402개념연습11 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 100; i < 151; i++){
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        boolean check1 = a == 5 || b == 5 || c == 5;
	        boolean check2 = i % 6 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	    
	}
}
