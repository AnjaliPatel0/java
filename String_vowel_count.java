public class String_vowel_count {

    public static void main(String[] args){

        String str="Anjali Patel";
        int  vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'||str.charAt(i)=='A'
                ||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                vowelcount++;
            else
            consonantcount++;

        }
        System.out.println("number of vowels " +vowelcount);
        System.out.println("number of consonant " +consonantcount);

    }
    
}
