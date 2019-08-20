package dependencyAndInversionofControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoAPP {

	public static void main(String[] args) {
		// Read the Spring file
		 ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retireve the bean from spring config file
		 VolleyballCoach theCoach = context3.getBean("myVolleyball", VolleyballCoach.class);
		
		// call method
		System.out.println(theCoach.getDailyFortune());
		 
		// close the context
		context3.close();

	}

}
