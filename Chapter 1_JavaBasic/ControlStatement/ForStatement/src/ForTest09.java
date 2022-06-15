package Java Basic.ControlStatement.ForStatement;

public class ForTest09 {

    public static void main(String[] args) {

//        编写for循环找出1-100中所有的素数
//        素数又称质数，指的是除了1和它本身不能被其他数整除的数

//        思路：验证7是否为素数
//        7/1：【不需要】
//        7/2：【7%2 != 0】
//        7/3：【7%3 != 0】
//        7/4：【7%4 != 0】
//        7/5：【7%5 != 0】
//        7/6：【7%6 != 0】
//        7/7：【不需要】
//        int i=7;
//        boolean isSuShu = true;//将i默认看作素数
//        for (int j=2;j<i;j++) {//j就是2，3，4，5，6
//            if (i%j == 0) {
//                //非素数
//                isSuShu = false;
//                //随即跳出循环
//                break;
//            }
//        }
//        System.out.println(isSuShu ? i+"是素数": i +"不是素数");

//        for (int i=2;i<=100;i++) {
//            boolean isSuShu = true;
//            for (int j=2;j<i;j++) {
//                if (i%j == 0) {
//                    isSuShu=false;
//                    break;
//                }
//            }
//            if (isSuShu) {
//                System.out.println(i);
//            }
//        }

//        编写for循环找出1-10000中所有的素数
//        要求每输出8个换一行
//        升级吧【加入统计机制】

        int count = 0;
        for (int x=2;x<=1000;x++) {
            boolean isSuShu = true;
            for (int y=2;y<x;y++) {
                if (x%y == 0) {
                    isSuShu = false;
                    break;
                }
            }
            if (isSuShu) {
                System.out.print(x+" ");
                count++;
                if (count%8 == 0) {
                    System.out.println();   //方法一
                }
//                if (count == 8) {
//                    System.out.println();   //方法二
//                    count = 0;
//                }
            }
        }

    }

}
