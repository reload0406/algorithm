package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/2525 */
/* 조건문 단계에서 조건을 사용하지 않았음 다시 풀어 볼 것 */

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(((a + ((b + c) / 60)) % 24) + " " + ((b + c) % 60));


    }
}
