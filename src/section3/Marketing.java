package section3;

import java.util.Scanner;

public class Marketing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String sc1 = sc.nextLine();
        System.out.println("Enter the old name of the company");
        String osc = sc.nextLine();
        System.out.println("Enter the new name of the company");
        String nsc = sc.nextLine();
        System.out.println("The content of the modified document is");
        System.out.println(sc1.replace(osc, nsc));

    }
}
