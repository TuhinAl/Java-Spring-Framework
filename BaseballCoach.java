package dependencyAndInversionofControl;

public class BaseballCoach implements Coach {
	
	private Coach coach;
	
	public BaseballCoach(Coach thecoach) {
		
		coach = thecoach;
	}

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService thefortuneService) {
		
		fortuneService = thefortuneService;
	}

	@Override
	public String Cricket() {
		
		return coach.getDailyFortune();
	}

	@Override
	public String Volleyball() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
