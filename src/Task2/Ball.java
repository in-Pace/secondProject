package Task2;

public class Ball {
    double x;
    double y;

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    Ball(){
        y = 0.0;
        x = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void move(double x, double y){
        setX(x);
        setY(y);
        System.out.println("New " + x + "; " + "New " + y);
    }

    @Override
    public String toString() {
        return "second.Ball(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}