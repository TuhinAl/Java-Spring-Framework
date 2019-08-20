package dependencyAndInversionofControl;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "i'am in Happy Fortune Service";
	}

}
