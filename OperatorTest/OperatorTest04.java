package JavaLesson.JavaBasic.OperatorTest;

public class OperatorTest04 {

    public static void main(String[] args) {

        //运算符优先级不确定，加小括号
        System.out.println( 5 > 3 & 5 > 2 );//true
        System.out.println( 5 > 3 & 5 > 6 );//false
        System.out.println( 5 > 3 | 5 > 6 );//true

        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false

        System.out.println(true | false);//true
        System.out.println(false | false);//false

        System.out.println(!false);//true
        System.out.println(!true);//false

        System.out.println(true^false);//true
        System.out.println(false^false);//false
        System.out.println(true^true);//false

        //分割线
        System.out.println("-----");

        //逻辑与和短路与
        //逻辑与
        int x = 10;
        int y = 8;
        System.out.println(x<y & ++x<y);//false
        System.out.println(x);//11

        //分割线
        System.out.println("-----");

        //短路与
        int a = 10;
        int b = 8;
        System.out.println(a<b && ++a<b);//false
        System.out.println(a);//10

    }

}
