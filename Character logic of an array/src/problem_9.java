public class problem_9 {
    public static String longestPalindromicString(String str){
        if(str==null) return "";
        int maxLen=0;
//        int currLen=0;
        int start=0;
        for(int i=0;i<str.length();i++){
            int len1=findPalindrome(str,start,i);
            if(len1 != 0){
                if(len1>maxLen){
                    maxLen=len1;
                    start=i-(len1-1)/2;
                }
            }
        }
        return str.substring(start,start+maxLen);
    }
    private static int findPalindrome(String str,int index1,int index2){
        int count=0;
        while (index1>=0 && index2<str.length() && str.charAt(index1)==str.charAt(index2)){
            index1--;
            index2++;
        }
        count=index2-index1-1;
        return count;
    }
    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        System.out.println(longestPalindromicString(str));
    }
}
