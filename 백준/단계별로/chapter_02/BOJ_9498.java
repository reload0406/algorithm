package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/9498 */
import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();
        int a = grade / 10;

        if ((a == 9) || (a == 10))
            System.out.println("A");
        else if(a==8)
            System.out.println("B");
        else if(a==7)
            System.out.println("C");
        else if(a==6)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
/* 두번째 방법
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if(grade>89)
            System.out.println("A");
        else if(grade>79)
            System.out.println("B");
        else if(grade>69)
            System.out.println("C");
        else if(grade>59)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
*/