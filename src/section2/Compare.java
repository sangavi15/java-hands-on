package section2;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(a + "is less than" + b);
        } else if (a > b) {
            System.out.println(a + "is greater than" + b);
        }
        sc.close();
    }

}
