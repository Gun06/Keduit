package A1701배열과누적개수_개념연습;
/*
[문제]
반복문을 활용해 1000부터 1500까지 반복하면서,
16의 배수이면서 일의 자리가 십의 자리의 두 배인 수만 numberList에 저장한 후,
그 개수와 합을 구하여 출력하시오.
*/ 
/*
[출력예시]
[1024, 1136, 1200, 1248, 1312, 1424]
6
7344
*/
public class A1701개념연습10 {
	public static void main(String[] args) {
		 int[] numberList = new int[1000];
		    int total = 0;
		    int count = 0;
		    int index = 0;
		    for(int i = 1000; i <= 1500; i++){
		        if(i % 16 == 0){
		            int a = i % 100 / 10;
		            int b = i % 10;
		            if(a * 2 == b){
		            	numberList[index] = i;
		            	index += 1;
		                count += 1;
		                total += i;
		            }
		        }
		    }
		    for(int i = 0; i < index; i++) {
		    	System.out.print(numberList[i] + " ");
		    }
		    System.out.println();
		    System.out.println(count);
		    System.out.println(total);
		  
	}
}
