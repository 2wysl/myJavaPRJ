class Bigdata{
    int score;
    String study;
    void exam(int score,String study){
        this.score = score;
        this.study = study;
    }
}
class daehun extends Bigdata{
    @java.lang.Override
    void exam(int score, String study) {
        super.exam(score, study);
        this.score = score + 50;
    }
}

public class Quiz15 {
    public static void main(String[] args){
        daehun daehunkim = new daehun();
        daehunkim.exam(50,"열공 중");
        System.out.println(daehunkim.score + "\n" + daehunkim.study);
        /*System.out.println(daehunkim.study);*/
    }
}
