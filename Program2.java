import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter no. 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter no. 2: ");
        num2 = sc.nextInt();
        System.out.println("The sum is :" + (num1 + num2));
        System.out.println("The subtraction is :" + (num1 - num2));
        System.out.println("The multiplication is :" + (num1 * num2));
        if (num2 == 0) {
            System.out.println("Denominator cannot be zero!");
        } else {
            System.out.println("The division is :" + (num1 / num2));
        }
    }
}
