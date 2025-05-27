import java.util.TreeSet;
public class RemoveDuplicate_USingSet {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,55,56,45};
        TreeSet<Integer> set=new TreeSet<>();
        int count  =0;
        for(int i =0;i<arr.length;i++){
    
        if(set.contains(arr[i])){
                System.out.println("Duplicate  number " +arr[i]);
                             count++;
             //  break;
            }
            set.add(arr[i]);
          } 
         

        //    for(int i =0;i<arr.length;i++){
        //     set.add(arr[i]);
        //    }
           System.out.println(set);
           System.out.println(count);
     }
}
