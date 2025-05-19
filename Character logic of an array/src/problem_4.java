public class problem_4 {
    public static void frequency(String str){
        int[] charCount= new int[256];
        StringBuilder charArray=new StringBuilder();
        for(char c:str.toCharArray()){
            charCount[c]++;
        }

        for(char ch:str.toCharArray()){
            if(!charArray.toString().contains(String.valueOf(ch))){
                System.out.println(ch+": "+charCount[ch]);
                charArray.append(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str="ddadddpplllo";
        frequency(str);

    }
}
