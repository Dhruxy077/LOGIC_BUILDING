import java.util.Scanner;

public class problem_1 {

    public static boolean checkPrime(int num){
        // Handle edge cases
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // Check divisibility only up to square root of num
        // Starting from 5 and checking every 6th number minus/plus 1
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
        sc.close();
    }
}
