//program to demonstrate on Spring bean life-cycle method
//driver class
package BeanLifeCycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookExecutor {

	public static void main(String[] args) {
		//ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");

		Book b=c.getBean("book",Book.class);
		System.out.println(b);
		//used to destroy method of spring bean life cycle
		/*registerShitdownHook() method comes under the 
		AbstractApplicationContext*/
		c.registerShutdownHook();
		
	}

}