import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        int n, element, index = 0, flag = 0;
        System.out.print("Enter size of array : ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter element to search : ");
        element = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (element == arr[i]) {
                index = i;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at index : " + index);
        } else {
            System.out.println("Elenent not found.");
        }
        scanner.close();
    }
}
