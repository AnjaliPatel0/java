public class String_Immutable_Mutable {

    public static void main(String[] args){
     
        //concat add the string
     // String str="hello";
     // System.out.println(str.concat("hiii"));
      //System.out.println((str));


       // Immutable
       // StringBuilder str=new StringBuilder(15);
       // str.append("hii");
       // System.out.println(str.length());
        //System.out.println(str.capacity());



        //Mutable
        // When length is greater then capacity then str is increases 
        //Formula to calculate old*2+2;
        StringBuilder str=new StringBuilder(10);
       str.append("hello hii byeee");
        System.out.println(str.length());
        System.out.println(str.capacity());

    }
    
}
