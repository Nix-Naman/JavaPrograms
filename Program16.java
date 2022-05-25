import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        double salary, HRA, DA, finalSal;
        System.out.print("Enter the salary : ");
        salary = scanner.nextDouble();
        if (salary < 5000) {
            HRA = calcHRA(salary, 20);
            DA = calcDA(salary, 50);
            finalSal = salary + HRA + DA;
            System.out.println("Gross Salary is : " + finalSal);
        } else if (salary >= 5000) {
            HRA = 2000.0;
            DA = calcDA(salary, 75);
            finalSal = salary + HRA + DA;
            System.out.println("Gross Salary is : " + finalSal);
        }
        scanner.close();
    }

    static double calcHRA(double sal, int per) {
        return sal * per / 100;
    }

    static double calcDA(double sal, int per) {
        return sal * per / 100;
    }
}
