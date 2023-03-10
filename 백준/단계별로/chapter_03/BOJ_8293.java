package 단계별로.chapter_03;

import java.util.Scanner;

public class BOJ_8293 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((n*(n+1))/2);
    }
}
/*
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < (n+1); i++)
            sum += i;


        System.out.println(sum);

    }
}
*/