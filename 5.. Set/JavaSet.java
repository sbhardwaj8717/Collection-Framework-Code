package Set;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    // set does not allow the multiple accorance of the elements. Or you may say that the redundancy of elements are not allowed.
    
    public static void main(String[] args) {
        // use java.util.Set
        
        // HasSet<>() contains elements with random order 
        // Time complexity ::- O(1)                     
        Set<Integer> set = new HashSet<>();

        /*

        LinkedSet<>() contains elements in a linked manner..hence the order of the elements remains same 
        Set<Integer> set = new LinkedSet<>();
        
        TreeSet<>() contains elements with sorted order and uses Binanary Search Tree 
        Time complexity ::- O(log n)                     
        Set<Integer> set = new TreeSet<>();
         
        */

        // 1. add(element) ::- used to add element in the set
        set.add(8);
        set.add(7);
        set.add(1);
        set.add(7);
        // this 7 will be added only once
        System.out.println(set);
        // it will be printed in a random oder
        System.out.println(set);


        // 2. remove(elememt) ::- delete that element which will be given inside the remove funtion
        set.remove(7);
        System.out.println(set);

        // 3. contains(elements) ::- returns boolean value for either element is present in the set or not

        System.out.println("element found ::-  "+ set.contains(1));
        System.out.println("element found ::-  "+ set.contains(9));


        // 4. isEmpty() ::- retuns  returns boolean value for either set is empty or not
        
        // as now the set contains 2 elemets so it will give false
        System.out.println( "Is set Empty? ::- " + set.isEmpty());
        
        // 5. size() ::- returns the size of the set
        System.out.println("the length/size ofthe set is ::-  "+set.size());

        // 6. clear() ::- used to delete all the elements form the set at once
        set.clear();
        System.out.println(set);
        System.out.println("Is set empty ? ::- "+set.isEmpty());
    }
}
