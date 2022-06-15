package JavaLesson.JavaBasic.typeOfData;

public class test1 {

    //这里的static必须加
    static int k = 1000;

    //变量还是遵循这个语法：必须先声明，再赋值，才能访问。
    //成员变量没有手动赋值系统会默认赋值【局部变量不会】
    static int f;   //成员变量

    public static void main(String[] args) {
        /*
        int i; //局部变量
        System.out.println(i);
        */

        System.out.println(k);   // 1000
        System.out.println(f);   // 0

    }

}
