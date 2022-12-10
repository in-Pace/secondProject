package Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static ArrayList <Circle> circleArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantity of circles: ");
        int amount = scan.nextInt();
        for (int i = 0;i<amount; i++ ){
            setCircle();
        }

        for (Circle circle : circleArrayList) {
            System.out.println(circle.toString());
        }
    }

    public static void setCircle(){
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter х: ");
        double x = scan.nextDouble();
        System.out.println("Enter y: ");
        double y = scan.nextDouble();
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();
        circleArrayList.add(new Circle(x,y,radius));
        System.out.println("third.Circle is save");
    }

}
