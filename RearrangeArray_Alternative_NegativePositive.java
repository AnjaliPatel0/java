
import java.util.*;
public class RearrangeArray_Alternative_NegativePositive {
   
   public static void Rearrange(int[] arr){
    ArrayList<Integer>positive =new ArrayList<>();
    ArrayList<Integer>negative =new ArrayList<>();

    for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){
            positive.add(arr[i]);
        }
        else{
            negative.add(arr[i]);
        }
    }

    int i=0, p=0, n=0;
    while(p<positive.size() && n<negative.size()){
        arr[i++] =negative.get(n++);
        arr[i++] = positive.get(p++);
    }
    while(n<negative.size()){
        arr[i++] =negative.get(n++);
    }
    while(p<positive.size()){
        arr[i++]=positive.get(p++);
    }
   }
    public static void main(String[] args) {
        int[] arr ={1,4,5,-2,-4,8,-5,6,7 ,-3,-6,-7};
        Rearrange(arr);
        System.out.println("Rearranged array ");
        System.out.println(Arrays.toString(arr));
    }
}
