import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Google google = new Google();
        google.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu termenul de cautare: ");
        String searchTerm = scanner.nextLine();

        Date d1 = new Date();
        for (String x: google.siteContent) {
            if (x.contains(searchTerm)) {
                System.out.println("Gasit");
            }
        }
        Date d2 = new Date();
        System.out.println(d2.getTime() - d1.getTime());
    }
}
