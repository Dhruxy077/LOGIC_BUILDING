public class problem_13 {

    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k++%2==0?"0":"1");
            }
            System.out.println();
        }
    }
}
