import java.util.ArrayList;
import java.util.List;

public class problem_10 {

    public static void recurPermute(int index,List<String> ans, StringBuilder res){
        if(index==res.length()){
            ans.add(res.toString());
            return;
        }

        for(int i=index;i<res.length();i++){
            swap(index,i,res);
            recurPermute(index+1,ans,res);
            swap(index,i,res);
        }
    }

    public static void swap(int index1, int index2,StringBuilder res){
        char temp=res.charAt(index1);
        res.setCharAt(index1,res.charAt(index2));
        res.setCharAt(index2,temp);
    }

    public static List<String> findPermutes(String str){
        List<String> ans=new ArrayList<>();
        StringBuilder res=new StringBuilder(str);
        recurPermute(0,ans,res);
        return ans;

    }
    public static void main(String[] args) {
        String str="ABC";
        List<String> permutes= findPermutes(str);
        for(String st:permutes){
            System.out.print(st+" ");
        }
    }
}
