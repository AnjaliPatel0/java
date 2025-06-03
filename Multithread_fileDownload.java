class FileDownload extends Thread {
    String Filename;
    public FileDownload(String Filename){
      this.Filename =Filename;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Filename + "downloading...." +(i*20) +"%");
        }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println(Filename + "donnnee");
        
    }
}
public class Multithread_fileDownload {
    public static void main(String[] args) {
        FileDownload f1 =new FileDownload("A ");
         FileDownload f2 =new FileDownload("B ");
        f1.start();
        f2.start();
    }
}
