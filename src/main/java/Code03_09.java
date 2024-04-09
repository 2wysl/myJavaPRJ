public class Code03_09 {
    public static void main(String[] args) {
        int num = 20;

//        System.out.println(++num + " : num 변수 출력 전에 +1이 되어서 21이 출력");
//
//        System.out.println(num++ + " : num 변수가 출력되고, +1 되기에 21이 출력");
//
//        System.out.println(num + " 22 출력");
//
//        System.out.println(--num + " : num 변수 출력 전에 -1이 되어서 21이 출력");
//        System.out.println(num-- + " : num 변수가 출력되고, -1이 되기에 21이 출력");

        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        num += 3;
        System.out.println(num);
        num -= 3;
        System.out.println(num + " ");
        num *= 3;
        System.out.println(num + " ");
        num /= 3;
        System.out.println(num + " ");
        num %= 3;
        System.out.println(num + " ");
    }
}
