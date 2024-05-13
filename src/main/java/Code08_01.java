class Rabbit5 {
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit5() {
        count ++; //new 함수로 메모리 올라갈 때마다 실행
    }
}
public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit5.count); //new 안 써도 static 썼으니 올라감

        Rabbit5 rabbit1=new Rabbit5();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit5.count);

        Rabbit5 rabbit2=new Rabbit5();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit5.count);

    }
}
