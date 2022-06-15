package JavaLesson.JavaBasic.MethodBasic;

public class MethodTest03 {

    public static void main(String[] args) {

        MethodTest03.sum(100,200);

        int a = 199;
        MethodTest03.sum(a,300);

        int k = 199;
        int l = 199;
        MethodTest03.sum(k,l);

    }

    public static void sum(int i,int j) {
        System.out.println(i + "+" + j + "=" +(i+j));
    }

}
