package JavaLesson.JavaBasic.MethodRecursion;

public class RecursionTest01 {

    public static void main(String[] args) {

        System.out.println("main begin");
        m();
        System.out.println("main over");

    }

    public static void m() {
        System.out.println("m() begin");
        m();
        System.out.println("m() over");
    }

}
