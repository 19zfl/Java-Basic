package JavaLesson.JavaBasic.typeOfData;

public class test5 {

    public static void main(String[] args) {

        //以下程序能否编译通过？
        //依据目前所学内容是无法编译通过的
        //理由：50是int类型的字面值，b是byte类型的变量，显然是大容量int转换成小容量byte
        //大容量转换成小容量是需要添加强制类型转换符的，以下程序没有添加，所以编译报错
        //但在实际编译的时候却编译通过了，这说明：
        //"在Java语言当中，当一个整数型字面值没有超过byte类型取值范围的话，该字面值可以直接赋值给byte类型的变量"
        byte a = 50;        //可以
        System.out.println(a);

        byte b = 127;       //可以
        System.out.println(b);

        //编译报错，128这个int类型字面值已经超出byte类型的取值范围。
        /*byte b1 = 128;*/
        /*System.out.println(b1);*/

        //纠正错误:需要使用强制类型转换符，但一定会损失精度
        //原始数据：00000000 00000000 00000000 10000000
        //强转之后的数据：10000000（这是储存在计算机内部的，这是一个补码。补码含义百度）
        byte c = (byte)128;     //-128
        System.out.println(c);

        /*
            计算机二进制有三种表示形式：
                原码，反码，补码
            计算机在任何时候底层表示和储存数据的时候采用了补码形式
         */

        byte d = (byte)198;
        System.out.println(d);      //-58

    }

}
