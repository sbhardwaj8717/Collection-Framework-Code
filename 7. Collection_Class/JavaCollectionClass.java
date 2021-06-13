import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// package Collection_Class;

public class JavaCollectionClass {
    public static void main(String[] args) {
        // This is used to give some extra functionalites

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(7);
        list.add(8717);
        list.add(3000);

        // 1. Collections.min(dataStructure) ::-  Used to find the min number in the given data structure.
        // 2. Collections.max(dataStructure) ::- Used to find the  max number in the given data structure.

        System.out.println("smallest number  ::- " + Collections.min(list));
        System.out.println("greatest number  ::- " + Collections.max(list));
        
        //  3.  Collections.frequency(dataStructure, element) ::- returns the frequency of any perticular element in the data structure
        
        System.out.println("frequency of 7  ::- " + Collections.frequency(list, 7));
        System.out.println("frequency of 8  ::- " + Collections.frequency(list, 8));
    
        // 4. Collections.sort(dataStructure) ::- used to sort the elements of the dataStructure in assending order
        // 5. Collections.sort(dataStructure, Comparator.reverseOrder() ) ::- used to sort the elements of the dataStructure in decending order

        Collections.sort(list);
        System.out.println("Shorted list ::- "+list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("reverse order of sorted list" + list);
    }   


}
