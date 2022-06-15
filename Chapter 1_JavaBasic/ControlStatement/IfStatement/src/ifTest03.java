package Java Basic.ControlStatement.IfStatement;

public class ifTest03 {

    public static void main(String[] args) {

//        需求:
//            判断当前天气:
//                当外边下雨时:
//                    带雨伞:
//                        判断性别:
//                            男生:带"大黑伞"
//                            女生:带"小花伞"
//                当外边天晴时:
//                    判断温度:
//                        当温度在30度以上:
//                            男生:带"墨镜"
//                            女生:涂抹"防晒霜"
//        tips:
//            1.一定要用嵌套
//            2.天气,温度,性别都需要从键盘输入

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统，你可以通过该系统做一些简单的判断。");
        System.out.println("说明1：1表示下雨，0表示晴天");
        System.out.println("说明2：1表示男，0表示女");
        System.out.println("说明3：温度为数字");

        //接收天气
        System.out.print("请输入天气状况：");
        int weather = scanner.nextInt();

        //判断天气
        if (weather == 1) {
//            System.out.println("下雨天");
            //接收性别
            System.out.print("请输入性别：");
            int sex = scanner.nextInt();
            if (sex == 1) {
                System.out.println("出门请带大黑伞！");
            } else if (sex == 0) {
                System.out.println("出门请带小花伞");
            } else {
                System.out.println("您是变性人吗？");
            }
        } else if (weather == 0) {
//            System.out.println("晴天");
            System.out.print("请输入天气温度：");
            int temperature = scanner.nextInt();
            if (temperature >= 30) {
                //接收性别
                System.out.print("请输入性别：");
                int sex = scanner.nextInt();
                if (sex == 1) {
                    System.out.println("出门请带墨镜！");
                } else if (sex == 0) {
                    System.out.println("出门请涂抹防晒霜！");
                }
            } else {
                System.out.println("可以放心出去了！");
            }
        } else {
            System.out.println("输入天气有误！");
        }
        System.out.println("重新进入该系统请重新运行！");

//        System.out.print("请输入今天天气:(天晴或下雨)");
//        Scanner scanner1 = new Scanner(System.in);
//        String weather = scanner1.next();
//        if (weather == "下雨") {
//            System.out.println("今天要带雨伞哦!");
//            System.out.println("请输入性别:(男或女)");
//            Scanner scanner2 = new Scanner(System.in);
//            String sex1 = scanner2.next();
//            if (sex1 == "男") {
//                System.out.println("那今天带大黑伞吧!");
//            }else if (sex1 == "女") {
//                System.out.println("那今天带小花伞吧!");
//            }
//        } else if (weather == "天晴") {
//            System.out.println("看下手机今天温度怎样?");
//            System.out.println("请输入温度:");
//            Scanner scanner3 = new Scanner(System.in);
//            int temperature = scanner3.nextInt();
//            if (temperature>=30) {
//                System.out.println("出门要做好防晒哦!");
//                System.out.println("请输入性别:(男或女)");
//                Scanner scanner4 = new Scanner(System.in);
//                String sex2 = scanner4.next();
//                if (sex2 == "男") {
//                    System.out.println("出门请带好墨镜哦!");
//                } else if (sex2 == "女") {
//                    System.out.println("出门请涂抹防晒霜哦!");
//                }
//            } else if (temperature < 30){
//                System.out.println("放心出门吧!");
//            }
//        }

    }

}
