import java.util.Scanner;

public class problem_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=2*num-1;i++){
            for(int j=1;j<=2*num-1;j++){
                if(i==j || j==(2*num-i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
