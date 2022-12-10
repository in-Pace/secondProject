package Task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x, y:");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        Ball test = new Ball(x, y);
        System.out.println(test);
        System.out.println("New x, y: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        test.move(x,y);
        System.out.println(test);
    }
}
