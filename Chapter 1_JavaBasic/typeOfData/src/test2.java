package JavaLesson.JavaBasic.typeOfData;

public class test2 {

    public static void main(String[] args) {

        //要求在控制台上输出“反斜杠字符”
        char k = '\\';
        System.out.println(k);

        //在控制台上输出一个普通的单引号
        /*char a = ''';*/ //第一个单引号会和第二单引号配对，就近原则。

        char a = '\'';
        //反斜杠具有转义功能，将第二个单引号转换成普通的单引号
        //第一个单引号和最后一个单引号配对。
        System.out.println(a);

        //要求在控制台上输出带有半角双引号的HelloWorld！。
        System.out.println("\"HelloWorld!\"");

        char m = '中';
        System.out.println(m);

        //native2ascii.exe将文字转换成unicode编码。
        //但是native2ascii.exe在后面出的新版本JDK中就已经移除了，目前最新版JDK17中不曾找到native2ascii.exe。
        char m2 = '\u4e2d';// \u4e2d对应的文字是“中”
        System.out.println(m2);

        //char数据类型的默认值\u0000。
        char s = '\u0000';
        System.out.println(s);
        System.out.println(s + 1);

    }

}
