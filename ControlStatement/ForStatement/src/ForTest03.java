package JavaLesson.ControlStatement.ForStatement;

public class ForTest03 {

    public static void main(String[] args) {

//        输出1-10中的奇数
        for (int i=1;i<=10;i+=2) {
            System.out.println("i--->>>"+i);
        }

//        输出1-10中的偶数
        for (int j=2;j<=10;j+=2) {
            System.out.println("j--->>"+j);
        }

        for (int k = 0;k < 10;) {
            System.out.println("k--->>>"+k);
            k++;
        }
//        0,1,2,3,4,5,6,7,8,9

        for (int l = 0;l < 10;) {
            l++;
            System.out.println("k--->>>"+l);
        }
//        1,2,3,4,5,6,7,8,9,10

    }

}
