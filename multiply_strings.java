import java.util.Arrays;

public class multiply_strings {

    public static String multiplyStrings(String s1, String s2) {
        StringBuilder result=new StringBuilder();
        int n=s1.length(),m=s2.length();
        int[] num1=new int[n];
        int[] num2=new int[m];
        for(int i=n-1;i>=0;i--){
            num1[i]=s1.charAt(i)-'0';
        }
        for(int i=m-1;i>=0;i--){
            num2[i]=s2.charAt(i)-'0';
        }

        Arrays.stream(num1).forEach(System.out::print);
        System.out.println();
        Arrays.stream(num2).forEach(System.out::print);
        int[] carry=new int[n+m];
        int i=n-1,j=m-1;
        while(i>=0 && j>=0){
            int sum=num1[i]*num2[j]+carry[i+j+1];
            carry[i+j]=sum/10;
            result.append(sum%10);
            i--;j--;
        }
        while(i>=0){
            int sum=num1[i]*carry[i+j+1];
            carry[i+j]=sum/10;
            result.append(sum%10);
        }
        while(j>=0){
            int sum=num2[j]*carry[i+j+1];
            carry[i+j]=sum/10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        System.out.println(multiplyStrings(num1,num2));

    }
}
