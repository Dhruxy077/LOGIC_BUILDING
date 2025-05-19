public class problem_5 {
    static int gp(int first_term, int common_ratio,int nth){
        if(nth == 1 || nth == 0) {
            System.out.print(first_term+" ");
            return first_term;
        }
        int multiply=gp(first_term,common_ratio,nth-1)*common_ratio;
        System.out.print(multiply+" ");
        return multiply;
    }
    public static void main(String[] args) {
        int first_term=3;
        int common_ratio=5;
        int nth_term=5;
        gp(first_term,common_ratio,nth_term);
//        System.out.println(gp(first_term,common_ratio,nth_term));
    }
}
