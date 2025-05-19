import java.util.Scanner;

public class problem_2 {
    public static boolean palindrome(String str){
//        char[] arr=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        if(palindrome(str)){
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is not palindrome.");
        }
    }
}
