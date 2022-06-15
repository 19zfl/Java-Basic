package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest09 {

    public static void main(String[] args) {

//        int retValue = m();
//        System.out.println(retValue);
        System.out.println(m());

    }

//    编译报错，缺少返回语句，以下程序编译器认为无法百分百保证“return 1;”会执行。
//    public static int m() {
//
//        int a = 10;
//        if (a>3) {
//            return 1;
//        }
//
//    }

//    以下程序可以保证“return 1;或者return 0;”执行，编译通过。
//    因为if else 语句能保证总有一个分支执行
//    public static int m() {
//        int a = 10;
//        if (a>3) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    public static int m() {
        return 9>2 ? 1 : 0;
    }

}
