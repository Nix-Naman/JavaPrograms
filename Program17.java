import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int unit, bill;
        System.out.print("Enter the electric unit : ");
        unit = scanner.nextInt();
        if (unit < 100) {
            bill = (unit * 2) + 200;
            System.out.println("Total bill mount is :" + bill);
        } else if (unit > 100 && unit <= 150) {
            bill = (unit * 3) + 200;
            System.out.println("Total bill mount is :" + bill);
        } else if (unit > 150) {
            bill = (unit * 7) + 200;
            System.out.println("Total bill mount is :" + bill);
        }
        scanner.close();
    }
}
