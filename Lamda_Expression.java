import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Lamda_Expression {
    public static void main(String[] args) {
    //     Runnable r = new Runnable() {
    //         public void run(){
    //             System.out.println("Runnable using Anonymous class");
    //         }
    //     }; 
    //    r.run();
     // Runnable r = ()->System.out.println("hii");
      //r.run();

      ArrayList<String> list =new ArrayList<>();
      list.add("anjali");
      list.add("rahul");
      list.add("mohit");
    //   Collections.sort(list ,new Comparator<String>(){
    //     public int compare(String a,String b){
    //         return a.compareTo(b);
    //     }
      
    // });
    Collections.sort(list,(a,b)->a.compareTo(b));
    System.out.println(list);
 } 
}
