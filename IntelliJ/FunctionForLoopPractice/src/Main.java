import  java.lang.*;
import  java.util.Arrays;

class Main{
    public static void main(String[] args) {
        System.out.println("Print Loop pattern with Function");

        int[] arr= {16,4,78,8,2, 9};

        rightPyramid();
        SortArray(arr);
    }

    public static void rightPyramid(){
        for (int i=0; i<5; i++) {
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void SortArray(int[] arr){
        int k= arr.length;
        for (int i=0; i< k; i++){
            for (int j=i+1; j<k; j++)
            {
                if(arr[i]>arr[j]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}