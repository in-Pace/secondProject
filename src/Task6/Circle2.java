package Task6;

public class Circle2 {
    double x;
    double y;
    double radius;
    Point2 center;

    Circle2(){
        this.center = new Point2(0, 0);
        this.radius = 1;
    }
    Circle2(double x, double y, double radius){
        this.center = new Point2(x, y);
        this.radius = radius;
    }

    public double findCircleArea(){
        return radius*radius*3.14;
    }
    public double findCircleLength(){
        return 2*3.14*radius;
    }

    public void setCenter(Point2 center) {
        this.center = center;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(" + "x=" + x + ", y=" + y + ", radius=" + radius + ", center=" + center.toString() + ')';
    }
}
