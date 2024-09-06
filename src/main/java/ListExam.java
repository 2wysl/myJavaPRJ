import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <=5 ; i++) {
            a.add(i);
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        for (int b : a){
            System.out.println(b);
        }

        a.forEach(c -> System.out.println(c));
    }
}