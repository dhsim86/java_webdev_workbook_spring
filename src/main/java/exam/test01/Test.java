package exam.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test01/beans.xml");

        Score score = (Score) ctx.getBean("score");

        System.out.println("Sum: " + score.sum());
        System.out.println("Average: " + score.average());
    }
}