package Java Basic.ControlStatement.IfStatement;

public class ifTest01 {

    public static void main(String[] args) {

        //需求：所在位置五公里内有肯德基的话，去KFC吃午饭
//        double distance = 6.0;
//
//        if (distance <= 5.0) {
//            System.out.println("去KFC吃午饭！");
//        }else {
//            System.out.println("不去了，太远了！");
//        }

//        需求：假设系统给定一个考生的成绩，成绩可能带有小数点，根据学生的成绩判断该学生的成绩等级
//        100-90：A
//        90-80：B
//        80-60：C
//        60-0：D

//        /*我的代码*/
//        double grade = 88;
//        //先判断成绩是否有效（0-100）
//        //超出范围输入报错信息
//        if ( grade >= 0 && grade <= 100 ) {
//            //逐级分类判断
//            if ( grade <= 100 && grade >= 90 ) {//判断A
//                System.out.println("A");
//            } else if ( grade < 90 && grade >= 80 ) {//判断B
//                System.out.println("B");
//            } else if ( grade < 80 && grade >= 60 ) {//判断C
//                System.out.println("C");
//            } else {//判断D
//                System.out.println("D");
//            }
//        } else {
//            System.out.println("成绩输入错误！");
//        }

        double score = 88;
        String tips = "";
        if ( score < 0 || score > 100 ) {
            tips = "成绩输入有误!";
        } else if ( score >= 90 ) {
            tips = "A";
        } else if ( score >= 80 ) {
            tips = "B";
        } else if ( score >= 60 ) {
            tips = "C";
        } else {
            tips = "D";
        }
        System.out.println(tips);
    }

}
