 class Person{
    void displayName(){
        System.out.println("Name:Anjali");
    }
 }
 class Student extends Person {
    void displayClass(){
        System.out.println("Class:11th");
    }
 }
 class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Monitor is checking phone");
    }
 }



public class Inheritance_Person_Student_Monitor {
    public static void main(String[] args) {
        Monitor m =new Monitor();
        m.displayClass();
        m.checkDiscipline();
        m.displayName();
    }
    
}
