package JavaLesson.ControlStatement.IfStatement;

import java.util.Scanner;

public class ifTest02 {

    public static void main(String[] args) {

//        需求:假设系统给定一个人的年龄,根据年龄来判断这个人处于生命的哪个阶段
//                年龄必须在0-150
//                0-5:幼儿
//                6-10:少儿
//                11-17:青少年
//                18-35:青年
//                36-55:中年
//                56-150:老年

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String tip = "";
        if ( age < 0 || age > 150 ) {
            tip = "年龄输入错误!";
        } else if ( age >= 56 ) {
            tip = "老年";
        } else if ( age >= 36 ) {
            tip = "中年";
        } else if ( age >= 18 ) {
            tip = "青年";
        } else if ( age >= 11 ) {
            tip = "青少年";
        } else if ( age >= 6 ) {
            tip = "少儿";
        } else {
            tip = "幼儿";
        }
        System.out.println(tip);
    }

}
