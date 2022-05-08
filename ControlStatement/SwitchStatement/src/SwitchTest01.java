package Java Basic.ControlStatement.SwitchStatement;

import java.util.Scanner;

public class SwitchTest01 {

    public static void main(String[] args) {

//        long b = 10L;
//        int a = b;
//        System.out.print(a);
//        java: 不兼容的类型: 从long转换到int可能会有损失

        //与上同理例子
//        long x = 100L;
//        switch (x) {}
//        switch()括号里面只能是int或string类型。

//        Test
//        short q = 100;
//        switch (q) {}
//        char w = 100;
//        switch (w) {}
//        byte e = 100;
//        switch (e) {}

//        switch (true) {}
        //编译报错

//        String username = "zfl";
//        switch (username) {}

        //较完整的switch代码：
//        接收用户的输入
//        1.表示星期一
//        2.表示星期二
//        ……
//        7.表示星期日

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入数字：");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字非法！");
        }

//        case穿透：
        switch (num) {
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字非法！");
        }

        //case合并：
        switch (num) {
            case 1: case 0:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字非法！");
        }

    }

}
