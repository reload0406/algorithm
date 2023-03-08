package 단계별로.chapter_01;
/* https://www.acmicpc.net/problem/10869 */
import java.util.Scanner;

public class BOJ_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.print(a % b);
    }
}
