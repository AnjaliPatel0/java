 import java.util.LinkedList;
   public class Collection_Framework_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> arr =new LinkedList<>();
        long start =System.nanoTime();
        arr.add(6);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        //to check if the  linkedlist contains that specific element
        System.out.println(arr.contains(5));
        long end =System.nanoTime();
        System.out.println(end-start);
        System.out.println(arr.get(2));
        System.out.println(arr.set(1,20));
        System.out.println(arr);
        System.out.println(arr.remove(1));
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
}
