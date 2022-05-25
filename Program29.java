import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        String str, search;
        int index = 0;
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        System.out.print("Enter the word to search: ");
        search = scanner.nextLine();
        index = str.indexOf(search);
        if (index != 0) {
            System.out.println("Word found at index " + index);
        } if (index == -1) {
            
        }{
            System.out.println("No word found!");
        }
        scanner.close();
    }
}
