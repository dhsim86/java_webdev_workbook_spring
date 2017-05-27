package exam.test16;

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

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/nhnent/workspace/workspace-intellij/java_webdev_workbook_spring/src/main/java/exam/test16/beans.xml");

		System.out.println("[Use CustomDateEditor]");

		SimpleDateFormat dateFormat = (SimpleDateFormat)ctx.getBean("dateFormat");

		Tire hankookTire = (Tire)ctx.getBean("hankookTire");
		System.out.println(hankookTire.getMaker());
		System.out.println(dateFormat.format(hankookTire.getCreatedDate()));

		Tire kumhoTire = (Tire)ctx.getBean("kumhoTire");
		System.out.println(kumhoTire.getMaker());
		System.out.println(dateFormat.format(kumhoTire.getCreatedDate()));


	}
}
