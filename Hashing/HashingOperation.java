// All operation take constantant time 0(1)
// -----------------------------------------------------------
package Hashing;

import java.util.*;

public class HashingOperation {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("Us", 50);

        // Get 
        int population = hm.get("india");
        System.out.println(population);
        System.out.println(hm.get("Pakistan"));
        System.out.println(hm);

        // containsKey 
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("pak"));

        // Remove
        System.out.println(hm.remove("china" ));
        System.out.println(hm);

        // size
        System.out.println(hm.size());


        // Empty
        System.out.println(hm.isEmpty());

        // clear
       hm.clear();
       System.out.println(hm.isEmpty());




    }

}
