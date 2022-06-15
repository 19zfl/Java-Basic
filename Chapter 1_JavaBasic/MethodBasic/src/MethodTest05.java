package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest05 {

    public static void main(String[] args) {

//        编译报错，参数数量不同
//        MethodTest05.sum();

//        编译报错，形参和实参数据类型不一致
//        MethodTest05.sum(true,false);

        MethodTest05.sum(10L,20L);

//        存在自动类型转换
        MethodTest05.sum(20,2);

    }

    public static void sum(long a,long b) {

        System.out.println(a+"+"+b+"="+(a+b));

    }

}
