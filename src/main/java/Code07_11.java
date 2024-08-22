class Rabbit3{
    String shape;
    int xPos;
    int yPos;

    Rabbit3(String value){
        shape=value;
    }

    void setPosition(int x, int y){
        xPos=x;
        yPos=y;
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit3 rabbit=new Rabbit3("원");

        System.out.println(rabbit.shape);


    }
}
