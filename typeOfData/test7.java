package JavaLesson.JavaBasic.typeOfData;

public class test7 {

    public static void main(String[] args) {

        //3.0是double类型的字面值
        //d是double类型的变量
        //不存在类型转换
        double d = 3.0;
        System.out.println(d);

        //5.1是double类型的字面值
        //f是float类型的变量
        //大容量转换成小容量需要添加强制类型转换符
        /*float f = 5.1;*/

        //第一种解决方式：强制类型转换
        /*float f = (float)5.1;*/
        //第二种：没有强制类型转换
        float f = 5.1F;//也可以小写f
        System.out.println(f);

    }

}
