import java.util.Arrays;

public class JavaArrays {
    // Here it is majorly used arrays predefiend functions

    public static void main(String[] args) {
        /*
            Array Initiallization using object creation of int[]
            int[] numbers = new int[5];
         */

         int []numbers = {1,2,3,4,5,15,8717};
         
         // printing all numbers using for each loop  
         
         for (int i : numbers) {
             System.out.println(i);
         }

         // 1. binarySearch(arrayName, element) ::- used to search any element in the array using binary search....
         //     time complexity of binary search is O(log n)
         //     binary search only works when the all elemets are in a sorted format
         //     if element not found in the array then it will print the nigative value of total array size
         int elementIndex = Arrays.binarySearch(numbers, 15);
         System.out.println("element found at index ::- "+ elementIndex);
         elementIndex = Arrays.binarySearch(numbers, 9);
         System.out.println("element not found so nigative index ::- "+ elementIndex);
         

        //  2. Arrays.sort(arrayName) ::- it is used to sort an array in increasing order
        //     uses Quick sort algorithm in background so it is a effient method to sort an array
        int non_sorted_array[] = {8,7,1,7,8717};

        System.out.println("Array is un-sorted form ::- ");
        for (int i : non_sorted_array) {
            System.out.print(i+ "  ");
        }

        Arrays.sort(non_sorted_array);
        System.out.println("\n Now this is a sorted array ::- ");
        for (int i : non_sorted_array) {
            System.out.print(i+ "  ");
        }

        // 3. Arrays.fill(arrayName, value) ::- this is used to fill the all array with some value at once

        int myCode[] = new int[10];
        System.out.println("\ndefault value of all indexes are 0 initialised by the JVM ::- ");
        for (int i : myCode) {
            System.out.print(i+ "  " );
        }

        Arrays.fill(myCode, 8717);
        System.out.println("\nNow the all indexes are initialised by 8717 ::-");

        for (int i : myCode) {
            System.out.print(i+ "  ");
        }

    }
}
