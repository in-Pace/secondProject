package Task6;

public class Point2 {
    double x;
    double y;

    Point2(){
        this.x = 0;
        this.y = 0;
    }
    Point2(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "w(" + "x=" + x + ", y=" + y + ')';
    }
}
