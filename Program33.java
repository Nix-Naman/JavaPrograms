import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age < 18) {
            throw new ArithmeticException("You are not elegible to vote.");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
    }
}
