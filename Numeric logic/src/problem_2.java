import java.util.Scanner;

public class problem_2 {

    public static long sumOfAllPrime(int num){
        if(num<2) return 0;

        boolean[] isPrime=new boolean[num+1];

        for(int i=2;i<=num;i++) isPrime[i]=true;


        for(int j=2;j*j<=num;j++){
            if(isPrime[j]) for(int k=j*j; k<=num;k+=j) isPrime[k]=false ;
        }

        long sum=0;
        for(int l=2;l<=num;l++) if(isPrime[l]) sum+=l;

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(sumOfAllPrime(num));
        sc.close();
    }
}
