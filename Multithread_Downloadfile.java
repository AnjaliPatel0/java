class downloadfile{
  public static void file(String file){
    for(int i=1;i<=5;i++){
      System.out.println(file + "downloading...." + (i*20) + "%");
    }
    try {
         Thread.sleep(2000);
    } catch (Exception e) {
          // System.out.println(file + "done");
    }
     System.out.println(file + "done");
  }
}

public class Multithread_Downloadfile {
  public static void main(String[] args) {
    downloadfile d1 = new downloadfile();
    d1.file("file A ");
    d1.file("file B ");

  }  
}
