package section4;

import java.util.Scanner;

public class ProductDetailsUsingConstructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDetails p = new ProductDetails();
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        p.setId(id);
        sc.nextLine();
        System.out.println("Enter the product name ");
        String productName = sc.nextLine();
        p.setProductName(productName);
        System.out.println("Enter the supplier name ");
        String supplierName = sc.nextLine();
        p.setSupplierName(supplierName);
        ProductDetails ps = new ProductDetails(id, productName, supplierName);
        ps.display();
        sc.close();

    }

}
