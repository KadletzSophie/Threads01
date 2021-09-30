/**
 @author Sophie Kadletz
 @version ü1, 30.09.2021
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Welcome ***");

        DatePrinter dp1 = new DatePrinter();
        Thread th1 = new Thread(dp1);

        CountPrinter dp2 = new CountPrinter();
        Thread th2 = new Thread(dp2);

        th1.start();
        th2.start();
    }
}
