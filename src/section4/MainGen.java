package section4;

import java.util.Scanner;

public class MainGen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of GenCs");
        int n = sc.nextInt();
        Trainee t[] = new Trainee[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Trainee();
            System.out.println("Enter Employee Id");
            int employeeId = sc.nextInt();
            sc.nextLine();
            t[i].setEmployeeId(employeeId);
            System.out.println("Enter Name");
            String name = sc.nextLine();
            t[i].setName(name);

        }
        Trainee tr = new Trainee();
        tr.display(t);
        sc.close();
    }

}
