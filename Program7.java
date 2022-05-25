import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner scanner = new Scanner(System.in);
        float f, c;
        System.out.print("Enter temperature in fahrenheit : ");
        f = scanner.nextFloat();
        c = (f - 32) * 5 / 9;
        System.out.println("Temperature in celcius : " + c);
        scanner.close();
    }
}
