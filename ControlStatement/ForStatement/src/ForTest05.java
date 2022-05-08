package Java Basic.ControlStatement.ForStatement;

public class ForTest05 {

    public static void main(String[] args) {

//        在一个程序的基础上，计算1-100所有奇数和
//        自己的答案
//        int result = 0;
//        for (int i = 1;i<=100;i+=2) {
//            result += i;
//        }
//        System.out.println(result);

//        标准答案
//        定义一个变量【盒子】，初始值为0
        int sum = 0;
        for (int i = 1;i<=100;i+=2) {
//            i一定是奇数
//            累加求和
            sum += i;
        }
        //            以上的for循环结束之后，最终输出求和的结果
        System.out.println(sum);

//        嵌套if方法求解
//        int result = 0;
//        for (int i = 1;i<=100;i++) {
//            if ((i%2)!=0) {   //判断是否奇数
//                result +=i;   //是则累加求和
//            }
//        }
//        System.out.println(result);

    }

}
