package JavaLesson.JavaBasic.MethodRecursion;

public class RecursionTest05 {

//    不使用递归计算n的阶乘
//    5的阶乘
    public static void main(String[] args) {

//        int sum = 5;
//        for (int i = 4;i>=1;) {
//            sum *= i;
//            i--;
//        }
//        System.out.println(sum);

        int n = 5;
        int setValue = factorial(n);
        System.out.println(setValue);

    }

    public static int factorial(int n) {

        int value = 1;
        for (int i = n;i > 0;i--) {
            value *= i;
        }
        return value;

    }

}
