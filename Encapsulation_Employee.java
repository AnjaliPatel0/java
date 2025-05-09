class Employee{
     private int id;
     private String name;
     private float salary;
     public void setDetails(int id,String name,float salary){
          this.id =id;
          this.name=name;
          this.salary=salary;
     }
     public int getId(){
          return id;
     }
     public String getname(){
        return name;
     }
     public float getSalary(){
        return salary;
     }

     void Employeedetails( int id,String name,float salary){
        System.out.println("Employee id is " +id);
        System.out.println("Employee name is " +name );
        System.out.println("Employee salary  is " +salary);
     }
}



public class Encapsulation_Employee {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setDetails(4562,"anjali",56789.934f);
        System.out.println(obj.getId());
        System.out.println(obj.getname());
        System.out.println(obj.getSalary());
        obj.Employeedetails(6784,"Angel",78543.98f);
    }
    
}
