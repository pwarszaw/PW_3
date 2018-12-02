import java.util.StringTokenizer;

public class Date {

    public static void main(String[] args) {

        StringTokenizer st1;

        String date = "29/04/2018";

        st1 = new StringTokenizer(date, "/");

        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());


    }
}
