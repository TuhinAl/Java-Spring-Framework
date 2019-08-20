package dependencyAndInversionofControl;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String Cricket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Volleyball() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
