import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, max = 0;
        System.out.print("Enter num 1 : ");
        num1 = scanner.nextInt();
        System.out.print("Enter num 2 : ");
        num2 = scanner.nextInt();
        System.out.print("Enter num 3 : ");
        num3 = scanner.nextInt();
        if (num1 > max)
            max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        System.out.println("The largest number is : " + max);
        scanner.close();
    }
}
