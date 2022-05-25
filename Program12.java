import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }
        scanner.close();
    }
}
