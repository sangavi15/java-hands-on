package section4;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
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

        System.out.println("Product Id is " + p.getId());
        System.out.println("Product Name is " + p.getProductName());
        System.out.println("Supplier Name is " + p.getSupplierName());

        sc.close();
    }
}
