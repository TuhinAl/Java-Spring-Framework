package dependencyAndInversionofControl;

public class VolleyballCoach implements Coach{
	private FortuneService fortuneService;
	

	public VolleyballCoach(){
		}	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: Inside Setterg Constructor");
		this.fortuneService = fortuneService;
	}


	
	
	
	// creat constructor for constructor injection
	public VolleyballCoach(FortuneService thefortuneService) {
		System.out.println("CricketCoach: Inside no-arg Constructor");
		fortuneService = thefortuneService;
	}

	
	
	
	
	public String Volleyball() {
		return "Hey I am a Volleyball Coacher";
	}

	@Override
	public String Cricket() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyFortune() {
		
		return "I am from VolleyballCoach Class: in getDailyFortune method";
	}
}