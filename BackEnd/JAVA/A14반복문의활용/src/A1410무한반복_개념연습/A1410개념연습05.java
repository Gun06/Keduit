package A1410무한반복_개념연습;
/*
[문제]
500보다 큰 8의 배수 중에서 
일의 자리가 6인 숫자를 4개만 출력하시오.
*/
/*
[출력예시]
536 576 616 656 
*/
public class A1410개념연습05 {
	public static void main(String[] args) {
		 int num1 = 8;
		    int num2 = 500;
		    int i = num1;
		    int count = 0;
		    boolean loop = true;
		    while(loop){
		        if(i > num2){
		            int a = i % 10;
		            if(a == 6){
		            	System.out.print(i + " ");
		                count += 1;
		                if(count == 4){
		                    loop = false;
		                }
		            }
		        }
		        i += num1;
		    }
	}
}
