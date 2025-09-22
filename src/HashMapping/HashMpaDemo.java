package HashMapping;

import java.util.HashMap;

public class HashMpaDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> menu = new HashMap<>();
        menu.put("burger",45);
        menu.put("pizza",20);
        menu.put("icecream",20);
        menu.put("Choco_lava Cake",20);

        //Remove the Item
        menu.remove("pizza");

        //Check if burger is present or not
        if (menu.containsKey("burger")){
            System.out.println("Yes is Contains Burger and it has " + menu.get("burger")+" burgers");
        }else {
            System.out.println("Stock is Finised");
        }

        //Iterate over Hashmap
        for (String X: menu.keySet()){
            //Print Key
            System.out.println(X);
            //Print Value
            System.out.println(menu.get(X));
        }
    }
}