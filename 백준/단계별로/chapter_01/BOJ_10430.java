package 단계별로.chapter_01;
/*https://www.acmicpc.net/problem/10430*/
import java.util.Scanner;

public class BOJ_10430 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.print(((a % c) * (b % c)) % c);
    }
}
