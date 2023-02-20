package usingautowireannot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
public class AutowiredAnnotationExecutor {

	public static void main(String[] args) {
		ApplicationContext f=new ClassPathXmlApplicationContext("web.xml");
		Citizen c=f.getBean("city",Citizen.class);
		c.display();

	}

}
