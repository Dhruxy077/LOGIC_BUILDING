import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_12 {

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> list=new ArrayList<>();
        for(int row=0;row<n;row++){
            List<Integer> temp =new ArrayList<>();
            for(int i=0;i<=row;i++){
                if(row==i || i==0){
                    temp.add(1);
                }else{
                    temp.add(list.get(row-1).get(i-1)+list.get(row-1).get(i));
                }
            }
            list.add(temp);
        }

        int space=list.size();
        for(List<Integer> arr:list){
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            space--;
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
