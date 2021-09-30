/**
 @author Sophie Kadletz
 @version ü1, 30.09.2021
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Welcome ***");

        DatePrinter dp1 = new DatePrinter();
        Thread th1 = new Thread(dp1);

        th1.start();
    }
}
