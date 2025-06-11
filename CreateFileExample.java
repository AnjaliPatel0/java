import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file =new File("new.txt");
            if(file.createNewFile()){
                System.out.println("file created " + file.getName());
            }else{
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
