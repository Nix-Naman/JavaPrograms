import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int rem,rev=0,num;
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        while (num !=0) {
            rem=num%10;
            rev=(rev*10)+rem;
            num = num/10;
        }
        System.out.println("The reverse is : "+ rev );
        scanner.close();
    }
}
