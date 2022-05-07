package JavaLesson.ControlStatement.ForStatement;

public class ForTest01 {

    public static void main(String[] args) {

//        需求：输出数字1-10
//        我自己写的
//        int num = 0;
//        for (int i = 1;i<=10;i++) {
//            num = i;
//            System.out.println(num);
//        }

//        答案
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
//        死循环
        for (;;) {
            System.out.println("死循环！");
        }

    }

}
