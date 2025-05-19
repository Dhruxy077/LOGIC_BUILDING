import java.math.BigInteger;

public class problem_12 {
    public static void main(String[] args) {
        String s1="0033";
        String s2="2";
        System.out.println(multiplyStrings(s1,s2));
    }

    public static String multiplyStrings(String s1, String s2) {
        BigInteger x=new BigInteger(s1);
        BigInteger y=new BigInteger(s2);
        System.out.println(x+" "+y);
        BigInteger product=x.multiply(y);
        return product.toString();
    }
}
