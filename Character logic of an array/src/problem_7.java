public class problem_7 {

    public static String commonPrefix(String[] strArray){
        if(strArray == null) return "";
        if(strArray.length ==1) return strArray[0];

        String prefix=strArray[0];

        for(int i=1;i<strArray.length;i++){
            while(strArray[i].indexOf(prefix) !=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] strArray={"flower","flow","flight"};

        System.out.println(commonPrefix(strArray));
    }
}
