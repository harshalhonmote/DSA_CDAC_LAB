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
       //String s = String.valueOf(11);
//-----------------------------------------------------------------------------------
        int total = IntStream.of(1,3,2,4,5).sum();
        //duration----------------
        Instant before = Instant.now();
         //some code
        Instant after = Instant.now();
        Duration d = Duration.between(before,after);
        System.out.println(d.toMillis());
        //-------------------------
        // return User.findAll().stream.map(UserDto::new).collect(toList());

        //1.
        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()));
        //o/p
                //Group by + Count
        // {
        // 	papaya=1, banana=2, apple=3, orang=1, watermelon=1
        // }
       
        //2.
        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        //Group by + Sum qty
        // {
        // 	papaya=20, banana=30, apple=40, orang=10, watermelon=10
        // }
       //COllectors.mapping() ->
       //1.
        Map<String, List<Integer>> result = personStream.collect(Collectors.groupingBy(p -> p.name, 
                                                    Collectors.mapping(e -> e.age, Collectors.toList())));
        //2.
          Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        //sort map by value--------------------------------------------------------
        //https://mkyong.com/java/how-to-sort-a-map-in-java/
        //https://youtu.be/F02LKnWJWF4?si=rq78pLoQ8D71BKj8 -->youTube
        Map<String, Integer> sortedMap = sortByValue(unsortMap);
        private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/
        return sortedMap;
    }//--------------------------------------------------------------------------
/----------------------Stream Map ----------------------------------
        //--- On List of String.----
        //Map<String, Integer>map = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //---- On List of Object----
        //Map<String,List<Person>>map = personList.stream().collect(Collectors.groupingBy(Person::getName));
        //  Map<String, Integer> sum = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
       // Map<BigDecimal, Set<String>> result =
        //                items.stream().collect(
        //                        Collectors.groupingBy(Item::getPrice,
        //                                Collectors.mapping(Item::getName, Collectors.toSet())
        //                        )
        //                );





    }
}
