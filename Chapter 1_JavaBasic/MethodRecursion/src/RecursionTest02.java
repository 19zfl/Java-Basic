package JavaLesson.JavaBasic.MethodRecursion;

public class RecursionTest02 {

    public static void main(String[] args) {

        int n = 50;
        int retValue = sum(n);
        System.out.println(retValue);

    }

    public static int sum(int n) {

        int result = 0;
        for (int i = 1;i<=n;i++) {
            result += i;
        }
        return result;

    }

}
