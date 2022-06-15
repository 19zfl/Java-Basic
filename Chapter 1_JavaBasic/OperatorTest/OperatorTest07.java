package JavaLesson.JavaBasic.OperatorTest;

public class OperatorTest07 {

    public static void main(String[] args) {

        //布尔类型的变量
        boolean sex = false;
        char c = sex ? '男' : '女';
        System.out.println(c);

        sex = true;
        c = (sex ? '男' : '女');
        System.out.println(c);

    }

}
