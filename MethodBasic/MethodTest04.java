package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest04 {


    public static void sum(int i,int j) {

        System.out.println(i+j);

        //调用dothing()方法
        MethodTest04.dothing();

    }

    //主方法
    public static void main(String[] args) {

        //调用sum()方法
        MethodTest04.sum(99,111);

        System.out.println("调用的方法执行完成！");

    }

    public static void dothing() {

        System.out.println("dothing()方法被调用了");

    }

}
