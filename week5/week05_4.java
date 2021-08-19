public class week05_4 {
    public static void main(String[] args){
        /*
        // [1] 배열 선언과 동시에 특정 값으로 초기화
        int[] sales_table = {55, 88, 60, 100, 90};
        System.out.println(sales_table[1]);

        // [2]
        int[] sales_table2 = new int[] {55, 88, 60, 100, 90};
        System.out.println(sales_table2[2]);

        // [3]
        int[] sales_table3 = {55, 88, 60, 100, 90};
        System.out.println(sales_table3[3]); // 100
        */


        // [1] 배열 선언과 동시에 특정 값으로 초기화
        int[] sales_table = {33, 52, 93, 100, 87};

        // [2] 반복문을 사용하여 모든 값 출력
        for(int i = 0; i < sales_table.length; i++){
            System.out.println(sales_table[i] + " ");
        }
        System.out.println();
    }
}
