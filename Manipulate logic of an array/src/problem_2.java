public class problem_2 {

    public static void main(String[] args) {
        int[] arr={9,99,100,4,2,98,100,-999,999};
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }

        System.out.printf("Max: %d , Min: %d",max,min);
    }
}
