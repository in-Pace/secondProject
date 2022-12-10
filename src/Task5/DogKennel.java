package Task5;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogArrayList = new ArrayList<>();
    public void addDog (Dog dog) {
        dogArrayList.add(dog);
    }
    public void showKennel () {
        for (Dog dog : dogArrayList)
            System.out.println(dog);
    }
}