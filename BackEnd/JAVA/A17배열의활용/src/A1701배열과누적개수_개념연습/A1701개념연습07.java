package A1701배열과누적개수_개념연습;
/*
[문제]
numberList에서 십의 자리가 2인 숫자의 개수와 합을 구하시오.
*/ 
/*
[출력예시]
4
692
*/
public class A1701개념연습07 {
	public static void main(String[] args) {
		 int[] numberList = {510, 423, 124, 512, 252, 23, 312, 453, 122};
		    int count = 0;
		    int total = 0;
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] % 100 / 10;
		        if(a == 2){
		            count += 1;
		            total += numberList[i];
		        }
		    }
		    System.out.println(count);
		    System.out.println(total);
	}
}
