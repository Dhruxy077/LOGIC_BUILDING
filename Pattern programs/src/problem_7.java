import java.util.Scanner;

public class problem_7 {

    public static void main(String[] args) {
//        int num=5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++,System.out.print(" "));
            for(int k=num-i;k>=1;k--,System.out.print("*"));
            for(int l=1;l<=num-i+1;l++,System.out.print("*"));
            System.out.println();
        }
        sc.close();
    }
}
