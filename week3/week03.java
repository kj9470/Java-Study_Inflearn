public class week03 {
    public static void main(String[] args){
        // 정수 선언
        int num = 12345;
        String str = "12345";
        // System.out.println(num.length());
        System.out.println(str.length());

        // 정수 -> 문자열로 변환 -> 자릿수 구하기
        String str_num = String.valueOf(num); // 문자열로 변환해 리턴
        System.out.println(str_num.length()); // 5

        // 문자열 + 정수형
        System.out.println(12345 + 1); // 12346
        System.out.println(str + 1); // 123451

        // 문자열 -> 정수로 변환
        int num_str = Integer.valueOf(str);
        System.out.println(num_str + 1);
    }
}
