package week1.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PrimitiveLabs {
    public static void main(String[] args) {
        Integer a = 127, b = 127;
        System.out.println(a == b);
        Integer c = 128, d = 128;
        System.out.println(c == d);
        System.out.println(c.equals(d));

        Map<String, Integer> stock = new HashMap<>();
        stock.put("apple", 10);
        int apples = stock.get("apple");     // works
        int mangoes = Optional.ofNullable(stock.get("mango")).orElse(0);
        System.out.println("Apples: "+apples);
        System.out.println("Mangoes: "+mangoes);


    }
}
