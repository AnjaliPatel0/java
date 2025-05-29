import java.util.HashMap;
public class Count_StringWord_usingHashMap {
    public static void main(String[] args) {
     /* *   String str1="Programming is a fun and fun is a programming";
        String[] newStr= str1.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String str:newStr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
    } */


    String str ="aabcccddeefg";
    char[] ch = str.toCharArray();
    HashMap<Character,Integer> map = new HashMap<>();
     for(char i:ch){
         
            map.put(i,map.getOrDefault(i,0)+1);
             
        }
        for(char i:map.keySet()){
            if(map.get(i)==1){
                System.out.println(i);
                break;
            }
        }
        System.out.println(map);
    }
}
