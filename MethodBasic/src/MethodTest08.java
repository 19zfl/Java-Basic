package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest08 {

    public static void main(String[] args) {

        //需求：实现接受一个方法的两个int类型的商

//        int result1 = divide(10,2);
//        System.out.println(result1);

        //int转long类型属于是自动类型转换
        long result2 = divide(10,2);
        System.out.println(result2);

//        System.out.println(divide(10,2));

    }

    public static int divide(int a,int b) {

        return a/b;

    }

}
