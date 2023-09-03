package level0;

import java.util.Scanner;

public class _3_문자열_반복해서_출력하기_2 {
    public static void main(String[] args) {
        StopWatch.start();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
        StopWatch.end();
    }
}

/*
asdf
100

2619
 */
