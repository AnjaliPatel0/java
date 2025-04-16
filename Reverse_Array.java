import java.util.Scanner;

public class Reverse_Array {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of arrr");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter value of arr");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int i=0;
        int j= n-1;
        while(i<=j ){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
             i++;
             j--;

        }
        System.out.println("The reversed array is");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        
    }
}
