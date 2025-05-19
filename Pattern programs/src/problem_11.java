import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num*2;i++){
            if(i<=num){
                for(int j=1;j<=num-i;j++,System.out.print(" "));
                for(int k=1;k<=2*i-1;k++,System.out.print("*"));
            }else{
                for(int j=1;j<=i-num;j++,System.out.print(" "));
                for(int k=1;k<=2*(2*num-i)-1;k++,System.out.print("*"));
            }
            System.out.println();
        }
    }
}
