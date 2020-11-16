package bab5.chapter3;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        foods.add("Apple");
        foods.add("Orange");
        foods.add("Watermelon");
        foods.add(1, "Raspbarry");
        
        System.out.println(foods.get(1));
        
        foods.set(1, "Pineapple");
        System.out.println(foods.get(1));
        
        foods.remove(1);
        System.out.println("");
        
        for (String x : foods) {
            System.out.println(x);
        }
        
        foods.clear();
        System.out.println("Size: " + foods.size());
    }
}
