package 단계별로.chapter_03;
/* https://www.acmicpc.net/problem/2438 */
import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char a ='*';
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < i; b++) {
                System.out.print(a);
            }
            System.out.println(a);
        }
    }
}
