package JavaLesson.JavaBasic.typeOfData;

public class test8 {

    public static void main(String[] args) {

        //编译报错，不兼容的类型
        //boolean flag = 1;

        boolean logiSuccess = true;

        if(logiSuccess) {
            System.out.println("恭喜你，登陆成功！");
        }else {
            System.out.println("对不起，用户名或密码错误!");
        }

    }

}
