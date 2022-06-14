package JavaLesson.JavaBasic.OperatorTest;

public class OperatorTest05 {

    public static void main(String[] args) {

        //基本的赋值运算
        int i = 10;
        i = i + 5;
        System.out.println(i);//15

        //扩展的赋值运算[+=运算可以翻译为”追加/累加“]
        int a = 10;
        a += 5;//等同于:a = a + 5;【同种数据类型】
        System.out.println(a);//15

        int k = 3;
        k %= 2;
        System.out.println(k);

        byte b = 10;
        //b=b+5;
        b = (byte)(b + 5);
        System.out.println(b);

        byte l = 9;
        l += 6;
        System.out.println(l);

        byte p = 0;
        p += 128;
        System.out.println(p);

    }

}
