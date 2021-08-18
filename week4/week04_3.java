public class week04_3 {
    public static void main(String[] args) {
        // [1] 변수 선언
        int hour = 10;

        // [2] 삼항 연산자 테스트 -> 10보다 작거나 같으면 100을 곱하시오
        int test = hour <= 10 ? hour * 100 : hour;
        System.out.println(hour);

        // [3] 삼항 연산자를 이용해 12시보다 작으면 오전, 크면 오후 출력
        String ampm = hour < 12 ? "오전" : "오후";
        System.out.println(ampm);
    }
}
