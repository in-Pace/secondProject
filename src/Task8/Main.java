package Task8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        doTask8(array);

    }
    public static void doTask8(String[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(list);
    }
}
