package Task4;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Shop test = new Shop();
        String name = ".";
        System.out.println("Enter goods:");
        while (!name.equals("")){
            name = scan.nextLine();
            test.goods.add(new Goods(name));
        }
        for(Goods good: test.goods){
            if (!good.name.equals("")) {
                System.out.println(good.toString());
            }
        }

    }

}