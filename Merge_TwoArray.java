public class Merge_TwoArray {
    public static void main(String[] args){
        int[] arr1={4,5,6,3};
        int[] arr2={4,5,3,6};

        int[] merge=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[arr1.length+i]=arr2[i];
        }
        System.out.println("merge  array " );
           for(int val:merge){
            System.out.print( val + "");
           }

    }
    
}
