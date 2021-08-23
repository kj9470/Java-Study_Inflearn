import java.util.Arrays;

public class week06_3 {
    public static void main(String[] args){
        // [1] ar, ar2 배열 선언
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // [2] 배열 복사하기 -> System.arraycopy()
        System.arraycopy(ar, 2, ar2, 4, 3); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
    }
}
