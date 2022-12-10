package Task6;
import Task3.Circle;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static ArrayList <Circle2> circleArrayList = new ArrayList<>();
    static Circle2 obj1 = new Circle2(1, 1, 1);
    static Circle2 obj2 = new Circle2(3, 2, 4);

    public static void main(String[] args) {
        compareCircles(obj1, obj2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantity of circles: ");
        int amount = scan.nextInt();
        for (int i = 0;i<amount; i++ ){
            setCircle();
        }

        for (Circle2 circle : circleArrayList) {
            System.out.println(circle.toString());
            System.out.println(circle.findCircleArea());
            System.out.println(circle.findCircleLength());
        }
    }

    public static void setCircle(){
        Scanner scan = new Scanner(System.in);
        Circle2 circle = new Circle2();
        System.out.println("Enter х: ");
        double x = scan.nextDouble();
        System.out.println("Enter y: ");
        double y = scan.nextDouble();
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();
        circleArrayList.add(new Circle2(x,y,radius));
        System.out.println("Circle is save");
    }
    static public void compareCircles(Circle2 obj1, Circle2 obj2){
        if (obj1 == obj2){
            System.out.println("They are the same");
        } else System.out.println("They are different");
    }
}