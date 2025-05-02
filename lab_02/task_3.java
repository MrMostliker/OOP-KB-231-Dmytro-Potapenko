import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x for first point: ");
        double x = input.nextDouble();
        System.out.println("Enter y for first point: ");
        double y = input.nextDouble();
        Point p1 = new Point(x, y);

        System.out.println("Enter x for second point: ");
        x = input.nextDouble();
        System.out.println("Enter y for second point: ");
        y = input.nextDouble();
        Point p2 = new Point(x, y);

        System.out.println("Enter x for third point: ");
        x = input.nextDouble();
        System.out.println("Enter y for third point: ");
        y = input.nextDouble();
        Point p3 = new Point(x, y);

        Triangle t = new Triangle(p1, p2, p3);
        System.out.println("Area: " + t.area());
        System.out.println("Centroid: " + t.centroid().Output());
        
        input.close();
    }

    private static class Point {
        double x, y;

      public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public String Output() {
            return "(" + x + ";" + y + ")";
        }
    }

   private static class Triangle {
        Point a, b, c;

        Triangle(Point a, Point b, Point c) {
            if (area(a, b, c) == 0) {
                throw new IllegalArgumentException("Degenerate triangle");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }

       public double area() {
            return area(a, b, c);
        }

        public static double area(Point p1, Point p2, Point p3) {
            return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2);
        }

       public Point centroid() {
            double x = (a.x + b.x + c.x) / 3;
            double y = (a.y + b.y + c.y) / 3;
            return new Point(x, y);
        }
    }
}