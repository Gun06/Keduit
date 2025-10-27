package A1703배열과순서_개념연습;
/*
[문제]
100의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
두 번째 약수에서 다섯 번째 약수를 뺀 값을 출력하시오.
*/
/*
[출력예시]
100 50 25 20 10 5 4 2 1 
40
*/
public class A1703개념연습03 {
	public static void main(String[] args) {
		  int num = 100;
		    int[] aList = new int[100];
		    int j = num;
		    int index = 0;
		    for(int i = 1; i < num + 1; i++){
		        if(num % j == 0){
		            aList[index] = j;
		            index += 1;
		        }
		        j -= 1;
		    }
		    for(int i = 0; i < index; i++){
		    	System.out.print(aList[i] + " ");
		    }
		    System.out.println();
		    int a = aList[1] - aList[4];
		    System.out.println(a);
	}
}
