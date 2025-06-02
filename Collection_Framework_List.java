import java.util.ArrayList;
import java.util.Collections;

 class Student implements Comparable <Student>{
      int age;
      String name;

      public Student(int age,String name){
         this.age =age;
         this.name=name;
      }
      public String toString(){
        return age + " " +name;
      }

      public int compareTo(Student s){
        return this.age-s.age;
      }
}
public class Collection_Framework_List {
public static void main(String[] args) {
    ArrayList<Student> list =new ArrayList<>();
    list.add(new Student(12,"Anjali"));
    list.add(new Student(10, "Akku"));
    list.add(new Student(1, "akki"));
    Collections.sort(list);
    for(Student s : list){
        System.out.println(s.toString());
    }
   
   
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(0);
    list1.add(3);
    Collections.sort(list1);
    System.out.println(list1);

   }
    
}
