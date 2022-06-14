package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest06 {

//    关于调用方法的类名省略问题
    public static void main(String[] args) {

        A.Test1();
        sum();

    }

    public static void sum() {

        System.out.println("调用test");

    }

}

class A {

    public static void Test1() {
        System.out.println("我被调用了");
    }

}
