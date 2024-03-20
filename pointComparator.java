package Junior;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class pointComparator implements Comparator<Point2D> {
    double xa, ya, xb, yb;

    public int compare(Point2D a, Point2D b) throws ClassCastException {
        xa = a.getX();
        ya = a.getY();
        xb = b.getX();
        yb = b.getY();
        double da = Math.sqrt(xa * xa + ya * ya);
        double db = Math.sqrt(xb * xb + yb * yb);
        return (int) (da - db);
    }

    public static void main(String[] args) {
        List<Point2D> points = new ArrayList<>();
        points.add(new Point2D.Double(3, 4));
        points.add(new Point2D.Double(1, 1));
        points.add(new Point2D.Double(2, 2));

        pointComparator comparator = new pointComparator();
        points.sort(comparator);

        for (Point2D point : points) {
            System.out.println(point.getX() + ", " + point.getY());
        }
    }
}