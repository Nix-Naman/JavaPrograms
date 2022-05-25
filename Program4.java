import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Zero is a even number.");
        } else if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        scanner.close();
    }
}
