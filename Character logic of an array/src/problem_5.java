import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;


public class problem_5 {
//    public static boolean anagram(String str1, String str2){
//        str1=str1.replaceAll("\\s","");
//        str2=str2.replaceAll("\\s","");
//        List<Character> chars1= str1.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
//        List<Character> chars2= str2.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
//
//        if(chars1.containsAll(chars2) && chars2.containsAll(chars1)){
//            return true;
//        }
//        return false;
//    }
    public static boolean anagram(String str1, String str2){
        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");

        if(str1.length() != str2.length()){
            return false;
        }

        int[] charCount=new int[256];

        for(char c:str1.toCharArray()){
            charCount[c]++;
        }
        for(char c:str2.toCharArray()){
            charCount[c]--;
        }

        for(int count:charCount){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="funeral";
        String str2="real fun";

//        System.out.println(str1);
        System.out.println(anagram(str1,str2));
    }
}
