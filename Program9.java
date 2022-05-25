import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int a = input.nextInt();// 5
        System.out.print("Enter a  number: ");
        int b = input.nextInt();// 7
        System.out.println("a=" + a + "\tb=" + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Numbers after swaping");
        System.out.println("a=" + a + "\tb=" + b);
        input.close();
    }
}
