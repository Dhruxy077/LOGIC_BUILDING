import java.util.LinkedList;
import java.util.Queue;

public class problem_5 {

    static boolean rotatedArrays(int[] arr1,int[] arr2){
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int n=arr1.length;
        for(int i=0;i<n;i++){
            q1.offer(arr1[i]);
            q2.offer(arr2[i]);
        }

        for(int i=0;i<n;i++){
            if(q1.equals(q2)) return true;
            q1.offer(q1.poll());
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={3,4,5,6,1,3};
        System.out.println(rotatedArrays(arr1,arr2));
    }
}
