public class problem_1 {

    public static boolean powerOf2(int num){
        //first approach
//        int temp=1;
//        while (temp<num){
//            temp=temp<<1;
//            if(temp==num) return true;
//        }
//        return false;

//        Second approach
        return ((num-1)&num)==0;
    }
    public static void main(String[] args) {
        int n=1024;
        System.out.println(powerOf2(n));
//        System.out.println(-45 >>> 3);
    }
}
