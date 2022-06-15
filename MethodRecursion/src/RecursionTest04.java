package JavaLesson.JavaBasic.MethodRecursion;

public class RecursionTest04 {

//    使用递归计算n的阶乘
//    5的阶乘
    public static void main(String[] args) {

        int n = 5;
        //调用factorial()获取值
        int setValue = factorial(n);
        System.out.println(setValue);

    }

//    定义一个factorial()方法进行阶乘计算
    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n*factorial(n-1);

    }

}
