

public class problem_8 {

    public static String replace(String str){
        if(str == null) return null;

        StringBuilder result=new StringBuilder();

        for(int i=0;i< str.length();i++){
            if(str.charAt(i) == ' '){
                result.append("%20");
            }else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str="This process ensures we find the longest string that is a prefix of both strings by gradually shortening the prefix until we find a match or determine there isn't one.";
        System.out.println(replace(str));
    }
}
