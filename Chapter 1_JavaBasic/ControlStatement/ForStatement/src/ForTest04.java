package Java Basic.ControlStatement.ForStatement;

public class ForTest04 {

    public static void main(String[] args) {

//        找出1-100的奇数

//        未嵌套方法
//        for (int i = 1;i<=100;i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 1;i<=100;) {
//            System.out.println(i);
//            i+=2;
//        }

//        int i = 1;
//        for (;i<=100;) {
//            System.out.println(i);
//            i+=2;
//        }

//        循环语句和条件判断语句嵌套使用【for和if的嵌套】
        for (int i = 1;i<=100;i++) {
//            求奇数(i%2) != 0
//            求奇数(i%2) == 1
//            求偶数(i%2) == 0
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }

    }

}
