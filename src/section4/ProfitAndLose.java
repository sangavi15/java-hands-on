package section4;

import java.util.Scanner;

public class ProfitAndLose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased ");
        int dozenCount = sc.nextInt();
        System.out.println("Enter the price per dozen");
        int pricePerDozen = sc.nextInt();
        System.out.println("Enter the selling price of 1 toy");
        int sellingPrice = sc.nextInt();
        ProfitAndLose pl = new ProfitAndLose();
        float profitLose = pl.calculateProfit(dozenCount, pricePerDozen, sellingPrice);
        System.out.printf("Sam's profit percentage is %.2f percent", profitLose);

        sc.close();

    }

    public float calculateProfit(int dozenCount, int pricePerDozen, int sellingPrice) {

        float costprice = (float) pricePerDozen / 12;
        float profit = (float) sellingPrice - costprice;
        float profitpercent = (profit / costprice) * 100;
        return profitpercent;
    }
}
