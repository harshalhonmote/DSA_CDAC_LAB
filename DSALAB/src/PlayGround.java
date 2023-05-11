package DSALAB.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 1. Implement following algorithms for multi digit numbers
// 	i. postfix evaluation
// 	ii. prefix evaluation
// 	iii. infix to postfix
// 	iv. infix to prefix

// 2. Find maximum value in stack without traversing it.

// 3. Write a function to find middle node in a linked list.

// 4. Write a function which will insert values sorted in linked list.

// 5. Write two different functions which return maximum and minimum value from the linked list respectively.

// 6. Implement linked list of employees.
//--------------------------------------------------------------------------------------

public class PlayGround {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> copy = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Integer arr[]={2,45,7};
        // Collections.addAll(list, arr);

        Integer arr[] = { 2, 45, 7 };
        list = Arrays.asList(arr);

        int[] input = new int[] { 1, 2, 3, 4 };
        List<Integer> output = Arrays.stream(input).boxed().collect(Collectors.toList());

        //int[] arr = list.stream().mapToInt(i -> i).toArray();//list to int arr
        
        // Collections.addAll(list, 2,4,6,9,1);
        copy.addAll(list);

        // copy = List.copyOf(list);
        // copy.forEach(System.out::println);
        // for (int x : copy) {
        //     System.out.println(x);
        // }

        // Converting above List to array using toArray()
        // method and storing it in an string array
       // String k[] = al.toArray(new String[al.size()]);
        
       //int[] result = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
       
       int[] values = {20,40,60,80,90};
     
       String get_values = Arrays.toString(values);
    
       System.out.println("values = "+get_values);

    }
}
