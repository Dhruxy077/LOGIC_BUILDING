public class problem_5 {
    static int XORofArray(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            System.out.printf("%2d ",xor);
        }
        System.out.println();
        return xor;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(XORofArray(arr));
    }
}
