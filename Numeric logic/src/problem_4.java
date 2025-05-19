import javax.swing.plaf.IconUIResource;

public class problem_4 {

    public static void sumDigits(int num){
        num=num<0?-num:num;
        while(num>9){
            int curr=0;
            int num2=num;
            while (num2!=0){
                int last=num2%10;
                curr+=last;
                num2/=10;
            }
            num=curr;
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int n=12345;
//        System.out.println();
        sumDigits(n);
    }
}
