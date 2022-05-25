import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int num, index = 0;
        int binary[] = new int[40];
        System.out.print("Enter any number : ");
        num = scanner.nextInt();
        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index++;
        }
        System.out.print("The binary equvalent is : ");
        for (int i = index; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        scanner.close();
    }
}
