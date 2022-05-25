import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        String str;
        int ch;
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        System.out.println("1. Convert to uppercase.");
        System.out.println("2. Convert to lowercase.");
        System.out.print("Enter your choice: ");
        ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println(str.toUpperCase());
                break;
            case 2:
                System.out.println(str.toLowerCase());
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
        scanner.close();
    }
}
