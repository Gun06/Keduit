package A1401반복문과누적_개념연습;
/*
[문제]
반복문을 사용하여 150부터 200까지의 숫자 중,
9의 배수이면서 홀수인 숫자들만을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
153 171 189 
513
*/
public class A1401개념연습04 {
	public static void main(String[] args) {
		int total = 0;
	    for(int i = 150; i < 201; i++){
	        boolean check1 = i % 9 == 0;
	        boolean check2 = i % 2 == 1;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            total += i;
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
}
