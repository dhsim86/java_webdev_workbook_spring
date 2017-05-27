package exam.test10;

/**
 * Created by nhnent on 2017. 5. 27..
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by nhnent on 2017. 5. 27..
 */
public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test10/beans.xml");

		System.out.println("[Properties type]------------------");
		Tire spareTire = (Tire)ctx.getBean("spareTire");
		for (Map.Entry<Object, Object> entry : spareTire.getSpec().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("[Map type]-----------------");
		Car car1 = (Car)ctx.getBean("car1");
		for (Map.Entry<String, Object> entry : car1.getOptions().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
