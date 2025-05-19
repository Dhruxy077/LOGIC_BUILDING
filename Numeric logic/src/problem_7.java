import java.util.Scanner;

public class problem_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armStrongNum(n));
    }

    public static boolean armStrongNum(int num){
        int temp=num;
        int sum=0;
//        int temp2=num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }

        temp=num;
        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        System.out.println(sum);
        return sum==num;
    }
}
