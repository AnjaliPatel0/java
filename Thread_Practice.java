public class Thread_Practice {
     

    public static void main(String[] args) {
        System.out.println("idhar to dekho");

        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("hiii");
        });

        t1.start();
        t2.start();
     }
}
