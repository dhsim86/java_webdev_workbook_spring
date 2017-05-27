package exam.test04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test04/beans.xml");
        
        System.out.println(ctx.getBean("score1"));
        System.out.println(ctx.getBean("score2"));
        System.out.println(ctx.getBean("score3"));
        System.out.println(ctx.getBean("score4"));
        System.out.println(ctx.getBean("score5"));
    }
}