import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("자연수를 입력 : ");
        num = s.nextInt();

        if (num % 15 == 0) {
            System.out.println("3과 5의 배수~!");

        } else if (num % 5 == 0) {
            System.out.println("5의 배수~!");

        } else if (num % 3 == 0) {
            System.out.println("3의 배수~!");

        } else {
            System.out.println("x_x");
        }

    }

}

//        Scanner s=new Scanner(System.in);
//        int num=s.nextInt();
//
//        if ((num%3==0)&&(num%5==0)) {
//            System.out.println("3의 배수, 5의 배수입니다");
//
//        }else if (num%3==0) {
//            System.out.println("3의 배수입니다");
//
//        } else if (num%5==0) {
//            System.out.println("5의 배수입니다");
//
//        }
//    }
//}