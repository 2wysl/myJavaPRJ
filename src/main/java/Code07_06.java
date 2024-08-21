class Rabbit{
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y){
        this.xPos=x;
        this.yPos=y;

        System.out.println("xPos: "+this.xPos+" / yPos:"+this.yPos); //자바에서 this는 클래스

    }
}

public class Code07_06 {
    public static void main(String[] args) {

        Rabbit rabbit1=new Rabbit();
        Rabbit rabbit2=new Rabbit();
        Rabbit rabbit3=new Rabbit();

        rabbit1.shape="원";
        rabbit2.shape="삼각형";
        rabbit3.shape="토끼";

        System.out.println("rabbit1.shape : " + rabbit1.shape);
        System.out.println("rabbit2.shape : " + rabbit2.shape);
        System.out.println("rabbit3.shape : " + rabbit3.shape);

        Rabbit rb1=new Rabbit();
        rb1.setPosition(100,100);

        Rabbit rb2=new Rabbit();
        rb2.setPosition(200, 200);

    }
}
