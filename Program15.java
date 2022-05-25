import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int days, year, month, day, rem;
        System.out.print("Enter a number of days : ");
        days = scanner.nextInt();
        year = days / 365;
        rem = days % 365;
        month = rem / 30;
        rem = rem % 30;
        System.out.println("There will be " + year + " year, " + month + " month, " + rem + " days.");
        scanner.close();
    }
}
