package exam.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test03/beans.xml");
        
        System.out.println("[Print the name of beans stored in container]");
        
        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        
        System.out.println("[Extract annonymous bean]");
        Score score1 = (Score)ctx.getBean("exam.test03.Score");
        Score score2 = (Score)ctx.getBean("exam.test03.Score#0");

        if (score1 == score2) {
            System.out.println("score == score#0");
        }

        Score score3 = (Score)ctx.getBean("exam.test03.Score#1");
        if (score1 != score3) {
            System.out.println("score != score#1");
        }

        System.out.println("[Extract by class type]");
        Score score4 =(Score)ctx.getBean(exam.test03.Score.class);
    }
}