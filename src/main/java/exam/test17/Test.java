package exam.test17;

/**
 * Created by nhnent on 2017. 5. 27..
 */

import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test17/beans.xml");

		Car car1 = (Car)ctx.getBean("car1");
		Car car2 = (Car)ctx.getBean("car2");

		System.out.println(car1);
		System.out.println(car2);
	}
}
