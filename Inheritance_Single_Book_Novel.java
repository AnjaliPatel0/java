class Book{
    void read(){
        System.out.println("Read the book");
    }
}
class Novel extends Book{
    void storyLine(){
    System.out.println("Read the Novel storyline");
    }
}

public class Inheritance_Single_Book_Novel {
    public static void main(String[] args) {
        Novel NOV=new Novel();
        NOV.storyLine();
        NOV.read();

    }
    
}
