package 단계별로.chapter_03;
/* https://www.acmicpc.net/problem/25314 */

import java.util.Scanner;

public class BOJ_25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < (n / 4); i++) {
            System.out.print("long ");

        }
        System.out.print("int");
    }
}
