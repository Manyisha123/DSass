import java.rmi.*;
import java.util.Scanner;

public class AddClient {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            String addServerURL = "rmi://localhost/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
            double d1 = sc.nextDouble();
            System.out.println("The first number is: " + d1);
            double d2 = sc.nextDouble();
            System.out.println("The second number is: " + d2);

            System.out.println("The sum is: " + addServerIntf.add(d1, d2));
        }
        catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}