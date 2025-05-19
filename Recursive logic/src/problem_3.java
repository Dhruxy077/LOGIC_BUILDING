public class problem_3 {

    static void towerOfHanoi(int n,char rod1,char rod2, char rod3){
        if(n==0) {
//            System.out.println("it was zero...");
            return;
        }
//        System.out.println("First recursion:" +n);
        towerOfHanoi(n-1,rod1,rod3,rod2);
        System.out.println("Disk "+n+" is moved from "+rod1+" to "+rod2);
//        System.out.println();
//        System.out.println("Second recursion:"+n);
        towerOfHanoi(n-1,rod3,rod2,rod1);
    }

    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,'A','C','B');
    }
}
