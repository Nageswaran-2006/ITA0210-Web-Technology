import java.util.Scanner;

public class EmployeeServletSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID:");
        String id = sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        System.out.println("Enter Mobile Number:");
        String mobile = sc.nextLine();

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + dept);
        System.out.println("Mobile     : " + mobile);

        sc.close();
    }
}
