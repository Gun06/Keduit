package A1305반복문과자릿수_문제;

import java.util.Random;

/*
[문제]
반복문을 사용하여 100부터 999까지의 숫자를 5번 출력한다. 
단, 일의자리에서 반올림하여 출력하시오.
*/
/*
[출력예시]
183 180
289 290
633 630
825 830
697 700
*/
public class A1305문제07 {
public static void main(String[] args) {
	Random ran = new Random();
	for(int i = 0; i < 5; i++){
		int a = ran.nextInt(801) + 100;
		int b = a / 10;
		int c = a % 10;
        if(c >= 5){
            b += 1;
        }
        int d = b * 10;
        System.out.println(a + " " + d );
    }
}
}