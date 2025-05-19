public class problem_4 {

    static int secondLargest(int[] arr){
        int lar=arr[0];
        int sec=arr[0];
        for(int a:arr){
            if(a>lar){
                sec=lar;
                lar=a;
            }else if(sec<a){
                sec=a;
            }
        }

        return sec;
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,1,7,9,4,90,99,91};
        System.out.println(secondLargest(arr));
    }
}
