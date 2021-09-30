/**
 * @author Sophie Kadletz
 * @version ü1, 30.09.2021
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
    
    /**
     * Mit den urspünglichen 20 Wiederholungen gibts es die Threads noch nacheinander aus.
     * Wenn man die Anzahl erhöht merkt man schnell dass es keine Reihung mehr gibt.
     * Bei der erhöhten Anzahl wird dann anschaulich dass Threads parallel und nicht nacheinander laufen.
     * Bei geringen Wiederholungen sind es noch so wenig Ausgaben das es noch nicht ersichtlich ist, dass es parallel läuft.
     */
}
