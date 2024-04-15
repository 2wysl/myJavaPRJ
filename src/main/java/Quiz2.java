import java.util.Scanner; //java.util패키지에서 scanner 클래스를 현재의 파일로 가져옴

public class Quiz2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); //Scanner 객체 생성. 사용자로부터 입력 읽을 수 있음

        int num1=s.nextInt(); //정수형 변수 num1에 사용자 입력값 대입
        int num2=s.nextInt(); //정수형 변수 num2에 사용자 입력값 대입
        int hap=0; //정수형 변수 hap의 값을 0으로 설정

        for(int i=num1; i<=num2; i++){ //num1값부터 num2값까지 1씩 증가하며 아래를 반복
            if(i%2!=0){ //값을 2로 나누었을 때 나머지가 0이 아니라면, 즉 홀수라면
                hap+=i; //hap에 num1부터 num2까지 홀수의 값을 더함
            }
        }

        System.out.printf("%d부터 %d까지 홀수의 합계 : " + hap, num1, num2); //num1값부터 num2값까지 홀수의 합계 출력

    }
}
