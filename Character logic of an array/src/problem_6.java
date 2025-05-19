import java.lang.reflect.Array;
import java.util.Arrays;

public class problem_6 {

    public static String compression(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
//        first calculate final length to optimize if compression is worth it
        int finalLength = countCompressedLength(str);
        if (finalLength >= str.length()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder(finalLength); //pre-size StringBuilder
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
//          if char is different or this is the end of string
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i)).append(count);
//                compressed.append(count);
                count = 0;
            }
        }

        return compressed.toString();
    }


    //     its an optimization technique to avoid the unnecessary compression when it wouldn't save space.
    private static int countCompressedLength(String str) {

        int compressedLength = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(count).length();
                count = 0;
            }
        }
//        System.out.println(compressedLength);
        return compressedLength;
    }


    public static String decompression(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int finalLength = countDecompressedLength(str);
        if (finalLength <= str.length()) {
            return str;
        }

        StringBuilder decompressed = new StringBuilder(finalLength);
        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            i++;

            StringBuilder count = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                count.append(str.charAt(i));
                i++;
            }

            int repetitions = Integer.parseInt(count.toString());
            for (int j = 0; j < repetitions; j++) {
                decompressed.append(currentChar);
            }
        }

        return decompressed.toString();

    }

    private static int countDecompressedLength(String str) {
        int decompressedLenght = 0;

        int i = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                StringBuilder number = new StringBuilder(1);
                number.append(str.charAt(i));
                decompressedLenght += Integer.parseInt(number.toString());

            }
            i++;
        }
        return decompressedLenght;
    }

    public static void main(String[] args) {
        String str = "aaabbbbbcccccddddddrrrrrttaaaghfgjldksfjjf";
////        System.out.println(str.length());
////        System.out.println(compression(str));
        String compressed = compression(str);
        System.out.println("compressed string: " + compressed);
        System.out.println("decompressed string: " + decompression(compressed));
//        int[] arr={2,2,4,5,6,1,3,3};
//        int[] arr1= Arrays.stream(arr).distinct().toArray();
//        for(int a:arr1){
//            System.out.print(a+" ");
//        }
    }
}
