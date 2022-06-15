package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest10 {

    public static void main(String[] args) {

        m();
        for (int i=10;i>=0;i--) {
            if (i==8) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("Execute Here!");

    }

    public static void m() {

//        返回值为void的就会出现编译报错
//        return 10;

        return;

    }

}
