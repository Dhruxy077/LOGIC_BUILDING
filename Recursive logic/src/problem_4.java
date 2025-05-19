import java.util.ArrayList;
import java.util.List;

public class problem_4 {

    static void recursion(int index,int[] arr,List<List<Integer>> ans, List<Integer> subset){
        if(index == arr.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[index]);
        recursion(index+1,arr,ans,subset);

        subset.remove(subset.size()-1);
        recursion(index+1,arr,ans,subset);
    }

    static List<List<Integer>> res(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        recursion(0,arr,ans,subset);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=res(arr);
//        for(List<Integer> num:result){
//            for(int n:num){
//                System.out.print(n+" ");
//            }
//            System.out.println();
//        }
        System.out.println(result);
    }
}
