import java.util.ArrayList;
import java.util.Collections;
public class Collection_Framework_Arraylist {
    public static void main(String[] args) {

         ArrayList<Character> arr2 = new ArrayList<>();
         System.out.println("After sorting");
        arr2.add('D');
        arr2.add('b');
        arr2.add('C');
       Collections.sort(arr2);

        System.out.println(arr2);
       
        //Ex 1
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Add String element in array");
        arr.add("Anjali");
        arr.add("Akku");
        arr.add("Anni");
        arr.add(0,"patel");
        System.out.println(arr);

        //Ex 2
         ArrayList<Integer> arr1 = new ArrayList<>();
       System.out.println("Add Integer element in array");
        arr1.add(56);
        arr1.add(67);
        arr1.add(78);
        arr1.add(0,21);
        System.out.println(arr1); 

         
     /*  for(int i=0;i<100;i++){
            arr1.add(i);
        }
        System.out.println(arr1); */

        //to get a certain index from a array to use get 
        System.out.println("Get elemnt of given index");
        System.out.println(arr.get(1));

        // to set the element at the index and print to use set 
        System.out.println(arr1.set(1, 20));
        System.out.println(arr1);

        //to remove the value from the index use remove and print
        System.out.println(arr1.remove(1));
        System.out.println(arr1);
         
        // clear is used to clear the array
        arr1.clear();
        System.out.println(arr1 + " ");

    
    }
    
}
