package A1305반복문과자릿수_문제;
/*
[문제]
반복문을 사용하여 20부터 40까지의 숫자 중,
각 자리수 중에 3이나 6이나 8가 없는 수만 출력하시오.
*/
/*
[출력예시]
20 21 22 24 25 27 28 40
*/
public class A1305문제05 {
public static void main(String[] args) {
	for(int i = 20; i < 41; i++){
        int a = i / 10;
        int b = i % 10;
        boolean check1 = a != 3 && a != 6 && a != 9;
        boolean check2 = b != 3 && b != 6 && b != 9;
        if(check1 && check2){
            System.out.print(i + " ");
        }
    }
}
}
