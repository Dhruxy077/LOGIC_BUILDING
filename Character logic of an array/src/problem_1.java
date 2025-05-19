import java.util.Scanner;

public class problem_1 {
    public static String reverse_string(String str){
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Original String: "+str);
        System.out.println("Reversed String:"+ reverse_string(str));
    }
}
