import java.util.Scanner;

class shape {
    double b, h;

    void get_data() {
        System.out.println("ENTER base(b) AND height(h) OF THE shape :");
        Scanner sc = new Scanner(System.in);
        System.out.print("BASE : ");
        b = sc.nextDouble();
        System.out.print("HEIGHT : ");
        h = sc.nextDouble();
    }

    void display_area() {
    }
}

class triangle extends shape {
    double area;

    void display_area() {
        area = 0.5 * b * h;
        System.out.println("AREA IS : " + area);
    }
}

class rectangle extends shape {
    double area;

    void display_area() {
        area = b * h;
        System.out.println("AREA IS : " + area);
    }
}

public class Program21 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        triangle ob1 = new triangle();
        ob1.get_data();
        ob1.display_area();

        rectangle ob2 = new rectangle();
        ob2.get_data();
        ob2.display_area();
    }
}
