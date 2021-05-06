package GameProgram;

public class GamerManager implements IGamerService{
	IGamerCheckService customerCheckService;
		
	public GamerManager(IGamerCheckService customerCheckService) {
		super();
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.customerCheckService.checkIfrealPerson(gamer)) {	
		    
			System.out.println("New Gamer Added " + gamer.getNickname() + " " + gamer.getId());
		}else{
			System.out.println("Invalid entry");
			}
		
	}

	@Override
	public void delete(Gamer gamer) {
        System.out.println("Gamer Deleted : " + gamer.getNickname() + " "+ gamer.getId());
		
	}

	
	@Override
	public void update(Gamer gamer) {
	
         System.out.println("Gamer update : " + gamer.getNickname() + " "+ gamer.getId());
		
	}


}
