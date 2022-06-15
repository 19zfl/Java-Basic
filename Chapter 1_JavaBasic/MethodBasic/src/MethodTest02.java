package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest02 {

    public static void main(String[] args) {

//        计算两个int数据类型的和
        MethodTest02.sumInt(10,20);
        MethodTest02.sumInt(50,20);
        MethodTest02.sumInt(1532,20);

    }

//    方法
//    该方法计算两个int类型的和，并输出结果
    public static void sumInt(int a,int b) {

        int c = a+b;
        System.out.println(a+"+"+b+"="+c);

    }

}
