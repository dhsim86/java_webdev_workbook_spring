package exam.test08;

/**
 * Created by nhnent on 2017. 5. 27..
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test08/beans.xml");

		System.out.println(ctx.getBean("car1"));
		System.out.println(ctx.getBean("car2"));
	}
}