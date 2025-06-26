import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChatacters {
    public static void main(String[] args) {
        String str = "abcdaabcdbbd";
        HashSet<Character> set = new HashSet<>();
        int max =0,left =0,start =0;

        for(int right =0;right<str.length();right++){
             while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
             }
             set.add(str.charAt(right));

             if(right-left+1>max){
                max=right-left+1;
                start = left;
             }
        }
        System.out.println("Length of longest substring: " +max);
        System.out.println("Longest substring: " +str.substring(start,start+max));
    }
}
