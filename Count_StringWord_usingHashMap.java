import java.util.HashMap;
public class Count_StringWord_usingHashMap {
    public static void main(String[] args) {
        String str1="Programming is a fun and fun is a programming";
        String[] newStr= str1.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String str:newStr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
    }
}
