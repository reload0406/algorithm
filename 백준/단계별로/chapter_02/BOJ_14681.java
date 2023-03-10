package 단계별로.chapter_02;
/* https://www.acmicpc.net/problem/14681 */
import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0) {
            if(y > 0)
                System.out.println("1");
            else
                System.out.println("4");
    }
        else{
            if(y < 0)
                System.out.println("3");
            if(y > 0)
                System.out.println("2");
        }
}

}

