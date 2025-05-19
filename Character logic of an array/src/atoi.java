public class atoi {
    static int myAtoi(String str){
        int len=str.length();
        if(len>11) return Integer.MAX_VALUE;
        boolean isNegative=false;
        int res=0;
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch=='-') isNegative=true;
           if(ch!='-' || ch!=' '){
               res=res*10+(ch-'0');
           }
        }

        if(isNegative){
            return -res;

        }

        return res;
    }
    public static void main(String[] args) {
        String str="-123";
        System.out.println(myAtoi(str));
    }
}
