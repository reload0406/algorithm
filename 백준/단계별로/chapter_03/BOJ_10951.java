package 단계별로.chapter_03;

/* 예외처리는 인터넷 찾아봄 예외처리 따로 더 공부 */
import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
            }
            catch (Exception e) {
                sc.close();
                break;
            }

            System.out.println(a + b);
        }
    }
}

