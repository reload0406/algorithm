package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/2480 */
import java.util.Scanner;

public class BOJ_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a == b && b == c)
            System.out.println(10000+(a*1000));

        else if ((a != b && b != c) && a != c) {
            if (a > b && a > c)
                System.out.println(a*100);
            if (b > a && b > c)
                System.out.println(b*100);
            if (c > a && c > b)
                System.out.println(c*100);
        }
        else {
            if (a == b)
                System.out.println(1000+(a*100));
            if (b == c)
                System.out.println(1000+(b*100));
            if (a == c)
                System.out.println(1000+(c*100));
            }

        }
}
