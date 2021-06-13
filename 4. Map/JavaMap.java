package Map;

import java.util.HashMap;
import java.util.Map;

// package Map;

public class JavaMap {

    // MAPS are the key value pairs of elements.  
    
    public static void main(String[] args) {
        //  use java.util.Map
        
        /*
            map<key, values> ::- key value pairs 
            keys ::-  always uniqe
            values ::- not need to be uniqe
        */
         Map<String, Integer> life = new HashMap<>();
         
         /*
            TreeMap<>() ::- it is similar to the hash map but it stores the data in the map in a shorted form using Binary Search Tree
            Map<String, Integer> life = new TreeMap<>();
         */


        // 1. put(element) ::- to add a new element in the Map      

        life.put("sbhardwaj", 8717);
        life.put("khagros", 1);
        life.put("white lily", 7);
        System.out.println(life);
        
        // if you tries to add a new data with a similar key that already exists in the map then it will override the older value 
        life.put("khagros", 87);
        life.put("white lily", 17);
        System.out.println(life);
        
        //2. containsKey(key) ::- returns boolean value for either the key is present or not.
        System.out.println("tamana is present ::- "+ life.containsKey("tamana"));
        System.out.println("white lily is present ::- " + life.containsKey("white lily"));
        
        //3. containsValue(value) ::- returns boolean value for either the value is present or not.
        System.out.println("8717 is present ::- "+ life.containsValue(8717));
        System.out.println("123 lily is present ::- " + life.containsValue(123));
        

        // 4. putIfAbsent(key, value) ::- it will check the key in the map...if the key is already present in the map then it will not update the value...but if key is not present in the map then it will add a new key value pair in the map 
        
        life.putIfAbsent("tamana", 8);      // add new key value pair
        life.putIfAbsent("white lily", 8717);       // it will be ignored because map has already a "white lily" key
        System.out.println(life); 

        // 5. entrySet() ::- returns the entries set of the map
        // To itierate all the key value pairs in Map we use this entrySet()

        for(Map.Entry<String,Integer> e : life.entrySet()){
            System.out.println("the entry set ::- " + e);
            System.out.println("the entry value ::- " + e.getKey());
            System.out.println("the entry keys ::- " + e.getValue());
        }

        // 6. keySet() ::- returns the set of keys from the map
        System.out.println(life.keySet());
        
        // to print all the keys of the keySet
        for (String ks : life.keySet()) {
            System.out.println(ks);
        }

        // 7. values() ::- returns the set of values from the map
        System.out.println(life.values());
        
        // to print all the values of the values
        for (Integer val : life.values()) {
            System.out.println(val);
        }

        // 8. isEmpty() ::- return boolean value either map is empty or not
        System.out.println("Is the life empty ::- "+life.isEmpty());

        // 9. remove(key) ::- to delete a key value pair form the map...it will remove the value whose key will same as the provided key in the remove function
        life.remove("sbhardwaj");
        System.out.println("now the new life is ::- "+ life); 
    }
}