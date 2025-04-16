

import java.util.Scanner;
public class Array {
    public static void main(String[] args){


        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of arrr");
        int n=in.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter value of arr");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println();
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

        //print  an array
    //    int  arr []={1,2,3,4,5,6};
       // for(int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
        }
    }
    


