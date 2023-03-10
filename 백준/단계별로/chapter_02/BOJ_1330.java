package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/1330 */
/* 제한을 두지 않았는데 왜 통과지 */
import java.util.Scanner;

public class BOJ_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        if (a > b)
            System.out.println(">");
        else if (a < b)
            System.out.println("<");
        else
            System.out.println("==");

    }
}
