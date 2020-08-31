package org.dxc.ioc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		   @SuppressWarnings("resource")
		   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-ioc.xml");
	          
	          Car car=(Car)applicationContext.getBean("student");
	          System.out.println("Carname is:"+car.getCarName());
	          System.out.println("Model is:"+car.getCarmodel());
	          System.out.println("Car Speed is:"+car.getSpeed());
	          System.out.println("Driver name is is:"+car.getDriver().getDriverName());
	          System.out.println("Driver salary is:"+car.getDriver().getDriverSalary());
	      

	     

		// TODO Auto-generated method stub

	}

}
