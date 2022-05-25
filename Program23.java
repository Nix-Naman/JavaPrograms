import java.util.Scanner;

interface Marks {
    public void getpercentage();
}

class Student_A implements Marks {
    double a, b, c;

    Student_A(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    public void getpercentage() {
        double percentage_a = ((a + b + c) / 300 * 100);
        System.out.println("The percentage of the student having three subject is: " + percentage_a + " %");
    }
}

class Student_B implements Marks {
    double x, y, z, v;

    Student_B(double x1, double y1, double z1, double v1) {

        x = x1;
        y = y1;
        z = z1;
        v = v1;
    }

    public void getpercentage() {
        double percentage_b = ((x + y + z + v) / 400) * 100;
        System.out.println("The percentage of the student having four subject is: " + percentage_b + " %");
    }
}

public class Program23 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Scanner s = new Scanner(System.in);
        double t, r, e, q;
        int ch;
        System.out.println("Enter your choice: \n\t1. For three subject \n\t2. For four subject \n\t3. Exit");
        do {
            System.out.println("Your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter marks for three subjects:");
                    t = s.nextDouble();
                    r = s.nextDouble();
                    e = s.nextDouble();
                    Student_A at = new Student_A(t, r, e);
                    at.getpercentage();
                    break;
                }
                case 2: {
                    System.out.println("Enter marks for four subjects:");
                    t = s.nextDouble();
                    r = s.nextDouble();
                    e = s.nextDouble();
                    q = s.nextDouble();
                    Student_B bt = new Student_B(t, r, e, q);
                    bt.getpercentage();
                    break;
                }
                case 3: {
                    System.out.println("...Exit...");
                    break;
                }
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (ch != 3);
    }
}
