class Student{
   private String name;
    private int marks;
    public void setDetails( String name, int marks){
     this.name=name;
     this.marks=marks;
    }
    public int getMarks(){
        return marks;
        
    }
    public String getString(){
        return name;
    }
    public void StudentDetails(){
    System.out.println("Angel");
    System.out.println(78);
    }
}

public class Encapsulation_Student {
    public static void main(String[] args) {
         Student obj =new Student();
         obj.setDetails("Anjali", 56);
         System.out.println(obj.getMarks());
         System.out.println(obj.getString());
         obj.StudentDetails();
    }
    
}
