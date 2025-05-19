public class problem_3 {

    // Function to calculate factorial of a number
//    public static int factorial(int n) {
//        int fact = 1;
//        System.out.println("In factorial:");
//        for (int i = 1; i <= n; ++i) {
//            System.out.println(fact);
//            fact *= i;
//        }
//        return fact;
//    }
//
//    // Function to count trailing zeros in factorial
//    public static int countTrailingZeros(int n) {
//        int fact = factorial(n);
//        int count = 0;
//
//        // Count trailing zeros by dividing the factorial by 10
//        System.out.println("In trailing zeroes:");
//        while (fact % 10 == 0) {
//            System.out.println(count+"\t"+fact);
//            count++;
//            fact /= 10;
//        }
//
//        return count;
//    }

    public static int countTrailingZeros(int num){
        int count=0;

        for(int i=5;num/i>=1;i*=5){
//            System.out.println();
            count+=num/i;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println(countTrailingZeros(n));
    }
}
