package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 200까지의 숫자 중에서,
십의 자리가 2이고 짝수인 숫자의 개수를 출력하시오.
*/
/*
[출력예시]
120 122 124 126 128 
5
*/
public class A1402개념연습07 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 100; i < 201; i++){
	        int a = i % 100 / 10;
	        boolean check1 = i % 2 == 0;
	        boolean check2 = a == 2;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
