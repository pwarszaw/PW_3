import java.awt.*;

public class PointSetter {

    public static void main(String[] args) {

        Point location = new Point(4, 13);

        show(location, "Położenie początkowe: ");
        changePoint(location, 7, 6, "Przejście do (7,6)");
        show(location, "Położenie końcowe: ");

    }

    private static void changePoint(Point location, int i, int i1, String s) {
    }

    static void show(Point point) {
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);

    }

    static void show(Point point, String desc) {
        System.out.println(desc);
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);


    }
}