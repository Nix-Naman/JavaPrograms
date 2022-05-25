import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int max = 0, size;
        System.out.print("Enter the size of array : ");
        size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is : " + max);
        scanner.close();
    }
}
