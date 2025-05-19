import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num=sc.nextInt();
//        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(num-i)*2;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1;l<=num;l++){
            for(int m=1;m<=num-l;m++){
                System.out.print("*");
            }
            for(int n=1;n<=(l)*2;n++){
                System.out.print(" ");
            }
            for(int m=1;m<=num-l;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
