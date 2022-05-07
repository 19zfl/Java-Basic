package JavaLesson.ControlStatement.ForStatement;

public class ForTest07 {

    public static void main(String[] args) {

//        for (int i=0;i<=5;i++) {
//            System.out.println("begin");
//            for (int j=0;j<1;j++) {
//                System.out.println(j);
//            }
//            System.out.println("over");
//        }

        for (int i=1;i<=5;i++) {
            for (int j=1;j<=5;j++) {
                System.out.println(i*j);
            }
        }

    }

}
