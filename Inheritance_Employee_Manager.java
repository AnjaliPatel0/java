class employee{
    void work(){
        System.out.println("Employee is working");
    }
}
class manager extends employee{
    void attendMeeting(){
    System.out.println("Manager is attending meeting");
}
}
    


public class Inheritance_Employee_Manager {
    public static void main(String[] args) {
        manager e= new manager();
        e.work();
        e.attendMeeting();
    }
    
}
