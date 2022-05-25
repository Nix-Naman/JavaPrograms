import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        System.out.println("The length of string is: " + str.length());
        scanner.close();
    }
}
