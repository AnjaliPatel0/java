import java.util.HashMap;
public class Frequency_OFAlphabet_InString_USingHAshmap {
    public static void main(String[] args) {
        String str ="programming"; //p=1 ,r=2
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        for(char i:ch){
             map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
