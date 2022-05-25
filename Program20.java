import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int min, size;
        System.out.print("Enter the size of array : ");
        size = scanner.nextInt();
        int arr[] = new int[size];
        min=1000000000;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element is : " + min);
        scanner.close();
    }
}
