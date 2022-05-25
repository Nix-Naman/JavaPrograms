import java.util.*;
import java.lang.*;

class Account {
    public String acc_name;
    public double acc_no;
    public int acc_type;
    public double balance;

    public void getdata(String name, double no, int type, double bal) {
        acc_name = name;
        acc_no = no;
        acc_type = type;
        balance = bal;
    }
}

class Savings extends Account {
    public void deposit(double amt) {
        balance = balance + amt;
        System.out.print("Balance is: " + balance);
    }

    public void withdraw(double amt) {
        balance = balance - amt;
        System.out.print("Balance is: " + balance);
    }

    public void interest(int time, int no) {
        double intr = balance * (1 + 6 / no);
        intr = Math.pow(intr, (time * no));
        System.out.print("Intertest calculated is: " + intr);
        balance = balance + intr;
        System.out.print("The new balance is: " + balance);
    }
}

class Current extends Account {
    public void deposit(double amt) {
        balance = balance + amt;
        System.out.print("Balance is: " + balance);
        ;
    }

    public void withdraw(double amt) {
        balance = balance - amt;
        System.out.print("Balance is: " + balance);
        ;
        check(balance);
    }

    public void check(double amt) {
        if (amt < 1000) {
            balance = balance - 500;
            System.out.print("Insufficient Balance: " + balance);
        }
    }
}

class Program22{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        int temp = 1;
        while (temp == 1) {
            double amt = 0;
            System.out.print("Enter name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("\nEnter Account no. : ");
            double no = sc.nextDouble();
            System.out.println("Enter accout type\n\t[0] Savings\n\t[1] Current");
            int type = sc.nextInt();
            do {
                System.out.println("Enter balance: ");
                amt = sc.nextDouble();
            } while (type == 1 && amt < 10000);
            if (type == 0) {
                Savings s = new Savings();
                s.getdata(name, no, type, amt);
                System.out.println("\n\t1.Deposit\n\t2.Withdraw\n\t3.Interest");
                int temp3 = sc.nextInt();
                if (temp3 == 1) {
                    System.out.println("Enter Amount: ");
                    double amt1 = sc.nextDouble();
                    s.deposit(amt1);
                } else if (temp3 == 2) {
                    System.out.println("Enter Amount: ");
                    double amt1 = sc.nextDouble();
                    s.withdraw(amt1);
                } else if (temp3 == 3) {
                    System.out.println("Enter time period: ");

                    int tp = sc.nextInt();
                    System.out.println("Enter no of times: ");
                    int nof = sc.nextInt();
                    s.interest(tp, nof);
                }
            } else if (type == 1) {
                Current c = new Current();
                c.getdata(name, no, type, amt);
                System.out.println("\t\n1. Deposit\t\n 2.Withdraw");
                int temp3 = sc.nextInt();
                if (temp3 == 1) {
                    System.out.println("Enter Amoumt: ");
                    double amt1 = sc.nextDouble();
                    c.deposit(amt1);
                } else if (temp3 == 2) {
                    System.out.println("Enter Amoumt: ");
                    double amt1 = sc.nextDouble();
                    c.withdraw(amt1);
                }
            }
            System.out.println("...Press 1 to continue...");
            temp = sc.nextInt();
        }
    }
}
