public class CountSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        StringBuilder curr = new StringBuilder("1");
        while (--n > 0) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < curr.length(); ++i) {
                char ch = curr.charAt(i);
                int count = 1;
                // Count consecutive identical digits
                while (i + 1 < curr.length() && curr.charAt(i + 1) == ch) {
                    ++count;
                    ++i;
                }
                next.append(count).append(ch);
            }
            curr = next;
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        CountSay sol = new CountSay();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + sol.countAndSay(i));
        }        
    }
}


