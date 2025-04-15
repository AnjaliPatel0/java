public class Print_Pyramid_ABC {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            int x=65;
            for( int j=1;j<=i;j++){
                System.out.print((char)x);
                x++;
            }
            System.out.println();
        }
    }
    
}
