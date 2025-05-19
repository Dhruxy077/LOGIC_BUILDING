import java.util.Arrays;

public class problem_1 {
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            arr[i]=arr[i]+arr[j]-(arr[j--]=arr[i++]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
}
