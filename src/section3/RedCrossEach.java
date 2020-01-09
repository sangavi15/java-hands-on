package section3;

import java.util.Scanner;

public class RedCrossEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int camp = sc.nextInt();
        int refugees[] = new int[camp];
        int sum = 0;
        for (int i = 0; i < camp; i++) {
            refugees[i] = sc.nextInt();
        }

        for (int i : refugees) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}