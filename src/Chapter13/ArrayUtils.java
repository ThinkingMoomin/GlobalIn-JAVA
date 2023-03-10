package Chapter13;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7);
        System.arraycopy(ar1, 0, ar2, 3, 4);

        for(int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i] + " ");
        }
        System.out.println();   // 단순 줄 바꿈

        for(int i = 0; i < ar2.length; i++) {
            System.out.println(ar2[i] + " ");
        }
    }
}
