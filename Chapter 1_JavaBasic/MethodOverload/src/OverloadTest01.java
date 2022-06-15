package JavaLesson.JavaBasic.MethodOverload;

public class OverloadTest01 {

    public static void main(String[] args) {

        //调用方法
        int result1 = sumInt(1,2);
        System.out.println(result1);

        double result2 = sumDouble(1.0,2.0);
        System.out.println(result2);

        long result3 = sumLong(1L,2L);
        System.out.println(result3);

    }

//    定义一个方法计算两个int类型的和
    public static int sumInt(int a,int b) {

        return a + b;

    }
//    定义一个方法计算两个double类型的和
    public static double sumDouble(double a,double b) {

        return a + b;

    }

//    定义一个方法计算两个long类型的和
    public static long sumLong(long a,long b) {

        return a + b;

    }

}
