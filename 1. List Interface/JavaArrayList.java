import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
    public static void main(String[] args) {
        // use java.util.* for this
        
        ArrayList<String> name = new ArrayList<>();
        // initially array is of empty size...but at the time of 1st element array size is increased by 10
        // each time when it reaches its max size then it increases the size by { size = size + size/2 + 1 }
        
        // funttions of ArrayList
        
        // 1. add(element) ::- add the element at the end of the list
        name.add("S.bhardwaj8717");
        name.add("Billllliiii");
        
        System.out.println(name);
        name.add("SBH");
        System.out.println(name);

        // 2. add(index, element) ::- add the element at the perticular index
        name.add(1, "white lily");
        System.out.println(name);


        // 3. addAll(anotherList) ::- add all the element of a list into another list
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Khagros");
        System.out.println(newList);
        newList.addAll(name);
        System.out.println(newList);
        
        // 4. get(index) ::-  to get the value of a particular index from the list
        
        String str = newList.get(2);
        System.out.println(str);
        System.out.println(newList.get(0));

        // 5. remove(index) ::- delete the element of the perticular index

        newList.remove(3);
        System.out.println(newList);

        // 6. remove(DataType.valueOf(element)) ::- remove the element form the array list where ever it will be present in the list
        newList.remove(String.valueOf("SBH"));
        System.out.println(newList);

        // 7. clear() ::- delete all the elements of the arrayList
        name.clear();
        System.out.println(name);

        // 8. set(index, UpdatedElement) ::- to update the value at any index
        newList.set(1,"pugggad");
        System.out.println(newList);
        
        // 9. contains(element) ::- return true or false for the element that is it present or not inside the arrayList
        System.out.println(newList.contains("white lily"));
        System.out.println(newList.contains("sbhardwaj8717"));
        
        // 10. size() ::- returns the size of the list
        System.out.println("lenth list = " + newList.size());
        // printing all element of the list one by one

        for(int i =0; i<newList.size(); i++){
            System.out.println("element " + (i+1) + " : " + newList.get(i));
        }

        // using for each loop
        for (String string : newList) {
            System.out.println("for each element : " + string);
        }

        // using Iterator loop
        Iterator<String> it= newList.iterator();
        while (it.hasNext()) {
            System.out.println("iterator element :" + it.next());
        }
    }
    
}