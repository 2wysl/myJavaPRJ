abstract class Rabbit7{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos=x;
        this.yPos=y;
    }

    abstract void sleep();
}

class HouseRabbit2 extends Rabbit7{
    @Override
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}
class MountainRabbit2 extends Rabbit7{
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit2 hRabbit=new HouseRabbit2();
        MountainRabbit2 mRabbit = new MountainRabbit2();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
