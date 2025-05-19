import java.util.Scanner;

public class problem_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int curr=0;
//        int l=0;
        int last=num*(num+1);
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++,System.out.print("-"));
            for(int k=0;k<=num-i;k++){
                System.out.print(++curr +"*");
            }
            for(int l=last-num+i;l<=last;l++){
                System.out.print(l);
                if(l<last) System.out.print("*");
            }
            last=last-num-1+i;
            System.out.println();
        }
        sc.close();
    }
}
