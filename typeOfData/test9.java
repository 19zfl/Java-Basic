package JavaLesson.JavaBasic.typeOfData;

public class test9 {

    public static void main(String[] args) {

        long g = 10;
//        byte h = (byte)(int)g/3;
//        语法报错，java代码编译是只管程序代码有无语法错误
        byte h = (byte)(int)(g/3);
        System.out.println(h);

    }

}
