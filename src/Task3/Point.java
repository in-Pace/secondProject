package Task3;

public class Point {
    double x;
    double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "w(" + "x=" + x + ", y=" + y + ')';
    }
}
