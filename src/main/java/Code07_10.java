class Rabbit2{ //한 프로젝트 안에 클래스명 중복 불가
    String shape;
    int xPos;
    int yPos;

    Rabbit2(){ // 생성자 : 객체를 생성하면 무조건 호출되는 메서드.클래스명과 동일, 객체를 생성하면서 변수의 값을 초기화하는 메서드.(토끼 객체를 생성하면서 모양을 '토끼'로 초기화하는 생성자)
        shape="토끼";
    }

    void setPosition(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit2 rabbit=new Rabbit2(); //생성자 호출

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);

    }
}
