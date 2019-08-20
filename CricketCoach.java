package dependencyAndInversionofControl;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	 // Default Constructor
	public CricketCoach() {
		
		System.out.println("CricketCoach: Inside no-arg Constructor");
	}
	
	
	// Setter method for Setter injection
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("CricketCoach: Inside Setter Method");
		fortuneService = thefortuneService;
	}



	// create constructor for constructor injection
	public CricketCoach(FortuneService thefortuneService) {
		
		fortuneService = thefortuneService;
	}
	
	

	public String Cricket() {
		
		return "Hey!! I am a Cricket Coacher";
	}
          
	@Override
	public String Volleyball() {
		
		return null;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
