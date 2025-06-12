import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class WriteTofile {
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
        // try{
        // FileWriter writer = new FileWriter("new.txt");
        // writer.write("hello ,this is a test message wriiten ");

        // writer.close();
        // System.out.println("Successfully wrote to the file");
        // }catch(IOException e){
        //     System.out.println("An error Occured");
        //     e.printStackTrace();
        // }

        //Read from file
        // try {
        //     File file =new File("new.txt");
        //     Scanner scanner = new Scanner(file);
        //     while(scanner.hasNextLine()){
        //         String data = scanner.nextLine();
        //         System.out.println(data);
        //     }
        //     scanner.close();
        // } catch (Exception e) {
        //     System.out.println("An error occured");
        //     e.printStackTrace();
        // }

        //Delete file
        // File file = new File("new.txt");
        // if(file.delete()){
        //     System.out.println("Deleted the file " + file.getName());
        // }else{
        //     System.out.println("failed to delete the file");
        // }
    }
}
