package in.abc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.abc.comp.Employee;

public class TestApp {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/abc/cfg/applicationContext.xml");
		
		Employee employee = factory.getBean("emp", Employee.class);
		System.out.println(employee);
		factory.close();
	}
}
