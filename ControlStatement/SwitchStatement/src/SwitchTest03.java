package JavaLesson.ControlStatement.SwitchStatement;

public class SwitchTest03 {

    public static void main(String[] args) {

        char cc = 'B';
        switch (cc) {
            case 'A' :
                System.out.println("高级");
                break;
            case 'B' :
                System.out.println("中级");
                break;
            case 'C' :
                System.out.println("初级");
                break;
            case 'D' :
                System.out.println("低级");
                break;
        }
        System.out.println();
        switch (cc) {
            case 'A' :
                System.out.println("高级");
                break;
            case 66 :
                System.out.println("中级");
                break;
            case 'C' :
                System.out.println("初级");
                break;
            case 'D' :
                System.out.println("低级");
                break;
        }

    }

}
