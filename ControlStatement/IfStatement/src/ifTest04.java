package JavaLesson.ControlStatement.IfStatement;

public class ifTest04 {

    public static void main(String[] args) {

        boolean sex = false;

        if(sex)
            System.out.print("男");
//            System.out.println("enenenne");
        else
            System.out.println("女");
//  该题重点在于：当if（）……else语句中，java语句只有一条的时候，不需要打上{}
//  当有多条java语句的时候，默认第一句是if……else……语句中的java语句。
//  剩余的会自动认为是if()else语句外的java语句。

    }

}
