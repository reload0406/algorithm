package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/2753 */
import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {

            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
/* 17736kb
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 4 == 0 && a % 100 != 0)
            System.out.println("1");
        else if(a%400==0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}


 */

/* 17712kb
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%400==0)
            System.out.println("1");
        else if(a % 4 == 0 && a % 100 != 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
} */