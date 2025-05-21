// in interface only abstract method is created
//but in abstarct class abstract method and non abstract method is created

interface Cleint{
   abstract void print();
            void show();
}
class Dev implements Cleint{
   public void print(){
    //  use public keyword is necessary otherwise it can use default 
    System.out.println(" bill of biryani ");
}
public void show(){
    System.out.println(" biryani ");
}
}
public class Interface {
    public static void main(String[] args) {
        Dev obj=new Dev();
        obj.print();
        obj.show();
    }
    
}
