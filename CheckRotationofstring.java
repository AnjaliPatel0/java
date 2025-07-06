public class CheckRotationofstring {
   public static void Rotation(String s1, String s2) {
            if (s1.length() != s2.length()) {
               System.out.println("False");
                return ;
            }
        // Concatenate s1 with itself and search for s2
        String combined = s1 + s1;
        if (combined.contains(s2)){
            System.out.println("True");
   } else {
    System.out.println("False");
   }
}
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 ="eAppl";

        Rotation(s1, s2);
    }
}
