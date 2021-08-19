public class week05_2 {
    public static void main(String[] args){
        // [1] 변수 선언
        int number = 0;

        // [2] 반복문을 돌면서 홀수, 짝수 체크
        while(number <= 30){
            number++;
            if(number % 2 == 0)
                System.out.print(number + " ");
        }
    }
}
