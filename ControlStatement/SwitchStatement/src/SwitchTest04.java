package JavaLesson.ControlStatement.SwitchStatement;

public class SwitchTest04 {

    public static void main(String[] args) {

//        实现计算器当中加减乘除求余数的功能
//        1.选择所有数据从键盘输入
//        2.使用switch语句进行判断
//        3.需要从控制台输入三次：第一个数，第二个数，运算符。

        System.out.println("欢迎使用简单计算器系统！");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入运算符：");
        String signs = scanner.next();

        int result = 0;
        switch (signs) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
            case "%" :
                result = num1 % num2;
                break;
            default:
                System.out.println("运算符输入有误！");
        }
        System.out.println(num1+signs+num2+"="+result);
    }

}
