package exam.test07;

/**
 * Created by nhnent on 2017. 5. 27..
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test07/beans.xml");

		System.out.println(ctx.getBean("car1"));

		Engine engine = (Engine)ctx.getBean("engine1");
		engine.setCc(3000);

		System.out.println(ctx.getBean("car2"));
        System.out.println(ctx.getBean("car3"));
        System.out.println(ctx.getBean("car4"));
	}
}
