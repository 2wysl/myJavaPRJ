import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // 숫자 입력 받아서 첫번째 시작값, 두번째가 끝나는 값까지 반복
        // + 200, 100이라면, 첫번째 수가 크다면... 200, 199, 198...100
        // + 3의 배수만 출력

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            for (int i = a; i >= b; i--) {
                if((i%3==0)&&(i!=0)) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if ((i%3 == 0) && (i!=0)) {
                    System.out.println(i);
                }
            }
        }

//        for(int i=a;i<=b;i++){
//            System.out.println(i);
//        }
    }
}
