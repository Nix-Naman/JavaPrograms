import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
        scanner.close();
    }
}
