package JavaLesson.JavaBasic.OperatorTest;

public class OperatorTest02 {

    public static void main(String[] args) {

        int k = 10;
        k++;
        System.out.println(k);//11
        int l = 10;
        l--;
        System.out.println(l);//9
        System.out.println("---");//分割线

        //++出现在变量后
        int a = 100;
        int b = a++;
        System.out.println(a);//101
        System.out.println(b);//100
        System.out.println("---");//分割线
        //++出现在变量前
        int c = 100;
        int d = ++c;
        System.out.println(c);//101
        System.out.println(d);//101
        System.out.println("---");//分割线

        int e = 100;
        System.out.println(e++);//100
        System.out.println(e);//101
        System.out.println("---");//分割线

        int r = 100;
        System.out.println(++r);//101
        System.out.println(r);//101
        System.out.println(--r);//100
        System.out.println(r++);//100
        System.out.println(r--);//101
        System.out.println(r--);//100
        System.out.println(r);//99

    }

}
