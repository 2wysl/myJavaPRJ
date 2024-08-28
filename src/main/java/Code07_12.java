class Rabbit4{
    private String shape;
    public int xPos; //Rabbit4 클래스 안에서만 쓸 수 있음
    private int yPos; //private : Rabbit4 클래스 안에서만 쓸 수 있음

    void setPosition(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit4 rabbit=new Rabbit4();

        rabbit.setPosition(100, 200);

        rabbit.xPos=300; //접근 불가능 (java: xPos has private access in Rabbit4)
        System.out.println(rabbit.xPos);
    }
}
