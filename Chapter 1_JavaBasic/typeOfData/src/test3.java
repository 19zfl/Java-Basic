package JavaLesson.JavaBasic.typeOfData;

public class test3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 010;//整数型字面值以0开头的，后面那一串数字就是八进制形式。
        int c = 0x10;//整数型字面值以0x开头的，后面那一串数字就是十六进制形式。

        System.out.println(a);//10
        System.out.println(b);//8
        System.out.println(c);//16

        System.out.println(a + b + c);//34(十进制)

        //123这个整数字面值是int类型
        //i变量声明的时候也是int类型
        //int类型的123赋值给int类型的变量i，不存在类型转换。
        int i = 123;
        System.out.println(i);

        //456整数字面值被当作int类型，占用4个字节
        //x变量在声明的时候是long类型，占用8个字节
        //int类型的字面值456赋值给long类型的变量x，存在类型转换。
        //int类型转换成long类型
        //int类型是小容量
        //long类型是大容量
        //小容量可以自动转换成大容量，称为自动类型转换机制。
        long x =456;
        System.out.println(x);

        //2147483647字面值是int类型，占用4个字节
        //y是long类型，占用8个字节，自动类型转换
        long y = 2147483647;
        System.out.println(y);

        //一般的整数字面值系统都是识别为int类型。
        //2147483648被当作int类型4个字节处理
        //显然2147483648超出了int类型的取值范围
        /*long z = 2147483648;*/
        //使2147483648当作long类型处理，须在后面加一个‘L’或‘l’,建议用大写L。
        //long z = 2147483648l;
        long z = 2147483648L;
        System.out.println(z);

    }

}
