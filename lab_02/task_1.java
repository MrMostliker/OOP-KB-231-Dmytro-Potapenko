import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter k for line1: ");
        float k1 = input.nextFloat();
        System.out.print("Enter b for line1: ");
        float b1 = input.nextFloat();

        System.out.print("Enter k for line2: ");
        float k2 = input.nextFloat();
        System.out.print("Enter b for line2: ");
        float b2 = input.nextFloat();

        Line line_1 = new Line(k1, b1);
        Line line_2 = new Line(k2, b2);
        Point point = line_1.intersection(line_2);
        if (point == null){
            System.out.println("Lines are parallel or coincident");
        } else{
            System.out.println(point.Output());
        }
       input.close();
    }

    private static class Point{
        private float x, y;

        public Point(float x, float y){
            this.x = x;
            this.y = y;
        }

        public String Output(){
            return ("(" + x + "," + y + ")");
        }
    }

    private static class Line{
        private float k, b;

        public Line(float k, float b){
            this.k = k;
            this.b = b;
        }

        public Point intersection(Line line_2){
            if (this.k == line_2.k){
                return null;
            }
            float x = ((line_2.b - this.b) / (this.k - line_2.k));
            float y = this.k * x + this.b;
            return new Point(x, y);
        }
    }
}