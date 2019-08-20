package dependencyAndInversionofControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//read spring file
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//retrieve  bean
		System.out.println(theCoach.Cricket());
		// call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		// call method
		context.close();
		// stop config file
		
	}

}
