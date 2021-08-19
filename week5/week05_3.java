public class week05_3 {
    public static void main(String[] args){
        /*
        // [1] 배열의 선언 및 크기 지정 -> 학생 10명의 성적을 담는 배열
        int[] scores = new int[10];
        int s_size = scores.length; // scores의 크기
        System.out.println(s_size); // 10

        // [2] 선언한 배열을 인덱스로 접근해 값 출력
        System.out.println(scores[0]); // 0
        System.out.println(scores[s_size - 1]); // 0
        */

        // [1] 배열 선언
        int[] sales_table = new int[5];

        // [2] 선언한 배열 공간에 값 입력하기
        sales_table[0] = 3;
        sales_table[1] = 11;
        sales_table[2] = 22;
        sales_table[3] = 33;
        sales_table[4] = 44;

        // [3] 값 출력하기
        System.out.println(sales_table[0]);
        System.out.println(sales_table[1]);
        System.out.println(sales_table[2]);
        System.out.println(sales_table[3]);
        System.out.println(sales_table[4]);
        System.out.println(sales_table[sales_table.length - 1]);
    }
}
