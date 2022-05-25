import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        int num = 100, flag = 0, n, ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tMenu");
        System.out.println("1. Check a number is prime or not.");
        System.out.println("2. Print prime number b/w 1 to 100");
        System.out.print("Enter your choice: ");
        ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter a number : ");
                n = scanner.nextInt();
                for (int i = 2; i < n / 2; i++) {
                    if (n % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.println("The number is prime.");
                else
                    System.out.println("The number is not prime.");
                break;
            case 2:
                for (int i = 3; i < num; i++) {
                    flag = 0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Wrong Input!");
                break;
        }
        scanner.close();
    }
}
