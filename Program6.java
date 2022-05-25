import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int num, factorial = 1;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial is: " + factorial);
        scanner.close();
    }
}
