import java.util.*;
public class GroupAnagramsSort {
     public static void main(String[] args) {
        String[] strs = {"cat", "dog", "tac", "god", "act", "good"};

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
      }
    }
}

 
