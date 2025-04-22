public class Sum_of_Two_D_ARRay {
    public static void main(String[] args){
        int[] [] arr= {{1,3,2,4},{2,4,3,5}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("sum of 2d array " +sum);
        }
    }
}


    
}