public class Print_repeat_character_InString {
    public static void main(String[] args){
        //String str="hello";
       // String str1="hello";
       //String str =new String("hello");
       //String str1=new String("hello");
        //System.out.println(str==str1);

        String str="helloo";
        char[] ch=str.toCharArray();
        
       for(int i=0;i<ch.length;i++){
        
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
                System.out.println(ch[i]); 
               return ;
            }
        }

        }
    }
    
}  

