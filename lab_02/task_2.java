import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Segment seg1 = readSegment(input);
        System.out.println("Length of the segment: " + seg1.length());
        System.out.println("Middle point of the segment: " + seg1.middle().Output());

        Segment seg2 = readSegment(input);

        Point intersection = seg1.intersection(seg2);
        if (intersection != null) {
            System.out.println("Point of intersection of segments: " + intersection.Output());
        } else {
            System.out.println("No intersection point within the segments");
        }

        input.close();
    }

    private static Segment readSegment(Scanner input) {
        Segment segment;
        while (true) {
            System.out.println("Enter the coordinates of the segment");

            System.out.print("Enter x for point1: ");
            double x = input.nextDouble();
            System.out.print("Enter y for point1: ");
            double y = input.nextDouble();
            Point p1 = new Point(x, y);

            System.out.print("Enter x for point2: ");
             x = input.nextDouble();
            System.out.print("Enter y for point2: ");
             y = input.nextDouble();
            Point p2 = new Point(x, y);

            segment = new Segment(p1, p2);
            if (segment.isValid()) {
                break;
            } else {
                System.out.println("Points coincide. Try again.");
            }
        }
        return segment;
    }

    private static class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Point other) {
            return Math.abs(this.x - other.x) < 1e-6 && Math.abs(this.y - other.y) < 1e-6;
        }

        public String Output() {
            return "(" + x + ", " + y + ")";
        }

        public boolean isBetween(Point a, Point b) {
            return Math.min(a.x, b.x) - 1e-6 <= x && x <= Math.max(a.x, b.x) + 1e-6 &&
                   Math.min(a.y, b.y) - 1e-6 <= y && y <= Math.max(a.y, b.y) + 1e-6;
        }
    }

    private static class Segment {
        private Point p1, p2;

        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public boolean isValid() {
            return !p1.equals(p2);
        }

        public double length() {
            return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        }

        public Point middle() {
            return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        }

        public Point intersection(Segment other) {
            double a1 = p2.y - p1.y;
            double b1 = p1.x - p2.x;
            double c1 = a1 * p1.x + b1 * p1.y;

            double a2 = other.p2.y - other.p1.y;
            double b2 = other.p1.x - other.p2.x;
            double c2 = a2 * other.p1.x + b2 * other.p1.y;

            double determinant = a1 * b2 - a2 * b1;

            if (Math.abs(determinant) < 1e-6) {
                if (Math.abs(a1 * other.p1.x + b1 * other.p1.y - c1) < 1e-6) {
                    System.out.println("Segments lie on the same line (may overlap)");
                } else {
                    System.out.println("Segments are parallel and do not intersect");
                }
                return null;
            }

            double x = (b2 * c1 - b1 * c2) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            Point intersect = new Point(x, y);

            if (intersect.isBetween(p1, p2) && intersect.isBetween(other.p1, other.p2)) {
                return intersect;
            }

            return null;
        }
    }
}
