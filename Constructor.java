class Student{
    String name="rahul";
    int age =18;
    Student( String name,int age){
        name=name;
        age=age;
        System.out.println( name +age);
    }
    Student(){
        System.out.println("helloooo");
    }
    void hello(){
        System.out.println("i am");
    }
}

public class Constructor {
    public static void main(String[] args) {
       Student obj =new Student("anjali",19);
       Student obj1 =new Student();
        obj.hello();
        
    }
    
}
