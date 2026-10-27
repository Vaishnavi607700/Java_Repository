package CollectionFramework;
import java.util.Scanner;
public class StaffDemo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of staff: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        Staf[] Staf = new Staf[n];
	        for (int i = 0; i < n; i++) {

	            System.out.println("\n1. Full-Time Staff");
	            System.out.println("2. Part-Time Staff");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter address: ");
	            String address = sc.nextLine();

	        if (choice == 1) {

	            System.out.print("Enter department: ");
	            String department = sc.nextLine();

	            System.out.print("Enter salary: ");
	            double salary = sc.nextDouble();

	            Staf[i] = new FullTimeStaff(
	                name, address, department, salary
	            );

	        } else {

	            System.out.print("Enter number of hours: ");
	            int hours = sc.nextInt();

	            System.out.print("Enter rate per hour: ");
	            double rate = sc.nextDouble();

	            Staf[i] = new PartTimeStaff(
	                name, address, hours, rate
	            );
	        }
	 }
	        System.out.println("\nFULL-TIME STAFF");

	        for (Staf s : Staf) {
	            if (s instanceof FullTimeStaff) {

	                FullTimeStaff f = (FullTimeStaff) s;

	                System.out.println("Name: " + f.name);
	                System.out.println("Address: " + f.address);
	                System.out.println("Department: " + f.department);
	                System.out.println("Salary: " + f.calculateSalary());
	            }
	        }
	 
System.out.println("\nPART-TIME STAFF");

for (Staf s : Staf) {
    if (s instanceof PartTimeStaff) {
        PartTimeStaff p = (PartTimeStaff) s;

        System.out.println("Name: " + p.name);
        System.out.println("Address: " + p.address);
        System.out.println("Hours: " + p.numberOfHours);
        System.out.println("Rate: " + p.ratePerHour);
        System.out.println("Salary: " + p.calculateSalary());
    }
}

sc.close();
}
}

	        
