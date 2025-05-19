public class problem_2 {

    public static int distinct(int[] arr){
        int ans=0;
        for(int num:arr) {
            ans^=num;
            System.out.println(ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,3,1,8,9,8,9};
        System.out.println(distinct(arr));
    }
}
