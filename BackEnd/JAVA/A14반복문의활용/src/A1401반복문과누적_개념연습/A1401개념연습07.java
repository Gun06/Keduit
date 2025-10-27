package A1401반복문과누적_개념연습;
/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중,
일의 자리가 십의 자리의 두 배이고 홀수인 숫자들만을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
12 36 
48
*/
public class A1401개념연습07 {
	public static void main(String[] args) {
		 int total = 0;
		    for(int i = 10; i < 100; i++){
		        int a = i / 10;
		        int b = i % 10;
		        boolean check1 = a * 2 == b;
		        boolean check2 = a % 2 == 1;
		        if(check1 && check2){
		        	System.out.print(i + " ");
		            total += i;
		        }
		    }
		    System.out.println();
		    System.out.println(total);
	}
}
