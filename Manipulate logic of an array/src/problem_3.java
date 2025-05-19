import java.util.Arrays;

public class problem_3 {

    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        System.out.println(k);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr,int left,int right){
        while (left<right){
            arr[left]=arr[left]+arr[right]-(arr[right--]=arr[left++]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        System.out.printf("Original Array: %s \n ", Arrays.toString(arr));
        rotate(arr,k);
        System.out.printf("Rotated Array: %s",Arrays.toString(arr));
    }
}
