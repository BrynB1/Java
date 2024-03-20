package Sophmore;
import java.util.ArrayList;
import java.util.List;
public class arraylist {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList: "+ numbers);
        int an=numbers.get(2);
        System.out.println(an);
        int rem = numbers.remove(1);
        System.out.println(rem);
    }
}
