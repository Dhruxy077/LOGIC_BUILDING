public class problem_4 {
    public static int toggleKthBit(int n,int k){
        return n^(1<<k);
    }
    public static void main(String[] args) {
        int n=20,k=3;
        System.out.println(toggleKthBit(n,k));
    }
}
