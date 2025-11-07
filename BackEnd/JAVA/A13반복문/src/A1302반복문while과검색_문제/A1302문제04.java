package A1302반복문while과검색_문제;
/*
[문제]
반복문을 사용하여 1부터 10까지 숫자를 출력하되,
3보다 작거나 7보다 큰 경우에는 숫자와 그 숫자의 세배를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 3
2 6
3 3
4 4
5 5
6 6
7 7
8 24
9 27
10 30	
*/
public class A1302문제04 {
public static void main(String[] args) {
	int i = 1;
    while(i <= 10){
        boolean check1 = i < 3;
        boolean check2 = i >= 3 && i <= 7;
        boolean check3 = i > 7;
        if(check1){
        	System.out.println(i + " " + i * 3);
        }
        if(check2){
        	System.out.println(i + " " + i);
        }
        if(check3){
        	System.out.println(i + " " + i * 3);
        }
        i = i + 1;
    }
}
}