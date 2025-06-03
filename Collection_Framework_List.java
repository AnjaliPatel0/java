import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
      int age;
      String name;
      int RollN;

      public Student(int age,String name,int ROllN){
         this.age =age;
         this.name=name;
         this.RollN=ROllN;
      }
      public String toString(){
        return age + " " +name + " " +RollN;
      }
    }

    class sortByName implements Comparator<Student>{
       public int compare(Student s1 ,Student s2){
         return s1.name.compareTo(s2.name);
       }
    }
     class sortByRollN implements Comparator<Student>{
       public int compare(Student s1 ,Student s2){
         return s1.RollN-s2.RollN;
       }
    }
      class sortByAge implements Comparator<Student>{
       public int compare(Student s1 ,Student s2){
         return s1.age-s2.age;
       }
    }

  /*class Student implements Comparable <Student>{
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
}*/ 

public class Collection_Framework_List {
public static void main(String[] args) {
    ArrayList<Student> list =new ArrayList<>();
    list.add(new Student(12,"Anjali" ,23039));
    list.add(new Student(10, "Akku" ,23046));
    list.add(new Student(1, "Anshu" ,23025));
    list.add(new Student(11, "Patel" ,23035));
    System.out.println("Sorted by NAme");
    Collections.sort(list,new sortByName());
    for(Student s : list){
        System.out.println(s.toString());
    }
    System.out.println("Sorted by RoolN");
    Collections.sort(list,new sortByRollN());
    for(Student s : list){
        System.out.println(s.toString());
    }
    System.out.println("Sorted by Age");
    Collections.sort(list,new sortByAge());
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
