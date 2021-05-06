package GameProgram;

public class CampaignManager implements ICampaignService{
	
	@Override
	public void beginNewCampaign(Campaign campaign) {
		System.out.println("New campaign" + campaign.getName() + campaign.getPercent());
		
	}

	@Override
	public void endCampaign(Campaign campaign) {
		System.out.println("Last day for campaign" + campaign.getName());
		
		
	}

}
