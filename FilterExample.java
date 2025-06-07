
import java.util.*;
import java.util.stream.Collectors;
public class FilterExample {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,3,4,5,10,15,20);
               int max =list.stream()
                      .reduce(0,(a,b)-> a>b?a:b);
                      System.out.println(max);
         int Secondmaxlist =list.stream()
                                .filter(n ->n!=max)
                                 .reduce(0,(a,b)-> a>b?a:b);
                                
        System.out.println(Secondmaxlist);

        //find max value
        //      int max =list.stream()
        //               .reduce(0,(a,b)-> a>b?a:b);
        //               System.out.println(max);
                      

        //  //find min value             
        //      int min =list.stream()
        //               .reduce(8,(a,b)-> a<b?a:b);
        //               System.out.println(min);
        // find max integer than 2 and even out of them and find sum
        // int sum =list.stream()   
        //                 .filter(n -> n>2)
        //                 .filter(n -> n%2==0)
        //                 .reduce(0,(a,b)-> a+b);
        //                  System.out.println(sum);


    

    //   Optional<Integer> sum = list.stream()
    //                            .reduce((a,b)-> a+b);
    //                             System.out.println(sum);
                                   
        // List<Integer> evenlist =list.stream()
        //                         .filter(n -> n%2==0)
        //                          .map(n -> n*5)
        //                         .collect(Collectors.toList());
        // System.out.println(evenlist);

        //  List<Integer> list1 =Arrays.asList(5,10,15,20);
        // List<Integer> evenlist1 =list1.stream()
        //                          .map(n -> n*5)
        //                          .collect(Collectors.toList());
        // System.out.println(evenlist1);
    }
}
