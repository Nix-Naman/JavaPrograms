import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner sc = new Scanner(System.in);
        float p, r, t, si;
        System.out.print("Enter principle amount: ");
        p = sc.nextFloat();
        System.out.print("Enter rate : ");
        r = sc.nextFloat();
        System.out.print("Enter time: ");
        t = sc.nextFloat();
        si = (p * r * t) / 100;
        System.out.println("The Simple Intrest is: " + si);
        sc.close();
    }
}
