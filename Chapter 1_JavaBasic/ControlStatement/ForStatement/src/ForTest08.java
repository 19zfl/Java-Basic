package Java Basic.ControlStatement.ForStatement;

public class ForTest08 {

    public static void main(String[] args) {

//        for循环实现九九乘法表
        for (int i=1;i<10;i++) {//外层循环9次
//            System.out.println(i);//行号
            for (int j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
//            换行
            System.out.println();
//            System.out.println("\n");
        }

    }

}
