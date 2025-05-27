import java.util.HashSet;
import java.util.TreeSet;
public class Collection_FrameWork_HashSet {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("D");
        set.add("v");
        set.add("E");
        set.add("G");
        System.out.println(set);

         TreeSet<String> set1 =new TreeSet<>();
        set1.add("D");
        set1.add("v");
        set1.add("E");
        set1.add("G");
        System.out.println(set1);
    }
}
