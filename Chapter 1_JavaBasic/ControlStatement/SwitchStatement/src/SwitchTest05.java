package Java Basic.ControlStatement.SwitchStatement;

public class SwitchTest05 {

    public static void main(String[] args) {

//        假设系统给定考生成绩，请判断该考生的成绩等级：
//        1.有效成绩范围：[0-100]
//        2.考试成绩可能带有小数
//        3.考试成绩和等级之间的对照关系：
//        [90-100]:A
//        [80-90):B
//        [70-80):C
//        [60-70):D
//        [0-60):E
//        以上必须要求采用switch语句完成，不能用if。
//        窍门：(int)(成绩/10)

        System.out.println("欢迎进入考试成绩等级认定系统");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入你的成绩：");
        Double grades = scanner.nextDouble();

        switch ((int)(grades/10)) {
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9: case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("输入有误，请重新输入！");
        }

    }

}
