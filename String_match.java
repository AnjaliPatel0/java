public class String_match {

    public static void main(String[] args){
        
        String str1="hiii";
        String str2="hlli";
        boolean isMatch=true;
        if(str1.length()!=str2.length()){
            isMatch=false;
        }
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    isMatch=false;
                    break;
                }
            }
        }
        if(isMatch){
            System.out.println("String  match");
        }
        else{
            System.out.println("string not match");

        }
       
        }
        
    
    }
    

