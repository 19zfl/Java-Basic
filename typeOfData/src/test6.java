package JavaLesson.JavaBasic.typeOfData;

public class test6 {

    public static void main(String[] args) {

        short a = 32767;    //通过
        /*short a1 = 32768;*/   //编译报错
        System.out.println(a);

        //65535是int类型，4个字节
        //bb是char类型，2个字节
        //按照以前所学知识来说，以下程序编译报错
        char bb = 65535;    //通过
        System.out.println(bb);

        /*b = 65536;*/      //编译报错
        /*System.out.println(b);*/

        /*
            当一个整数字面值没有超出byte，short，char的取值范围，
            这个字面值可以直接赋值给byte，short，char类型的变量。
            这种机制SUN允许了，目的是为了方便程序员的编程。
         */

    }

}
