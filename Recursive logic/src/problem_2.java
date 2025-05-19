public class problem_2 {
    static void fibonacci(int a,int b,int n){
       if(n<=1) return;
       int next=a+b;
        System.out.print(next+" ");
        fibonacci(b,next,n-1);
    }
    public static void main(String[] args) {
        int num=10;
        System.out.print("0 1 ");
        fibonacci(0,1,num);

    }
}
