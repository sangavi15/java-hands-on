package section2;

import java.util.Scanner;

public class DiscountCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of item 1 : ");
        float item1 = sc.nextFloat();
        System.out.println("Price of item 2 : ");
        float item2 = sc.nextFloat();
        System.out.println("Discount in percentage : ");
        int discount = sc.nextInt();
        float d = discount;

        float total = item1 + item2;
        float dis = (total * discount) / 100;
        float discountAmount = total - dis;
        System.out.printf("Total amount : $%.2f\n", total);
        System.out.printf("Discounted amount : $%.2f\n", discountAmount);
        System.out.printf("Saved amount : $%.2f\n", dis);
        sc.close();
    }

}
