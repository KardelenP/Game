package GameProgram;

public class Main {

	public static void main(String[] args) {
		ComputerGame computerGame = new ComputerGame();
		computerGame.setName("Fortnite");
		computerGame.setPrice(1500);
		
		
		Gamer gamer = new Gamer();
		gamer.setId(15);
		gamer.setNickname("ezhel");
		gamer.setDateOfBirthdate("15,2,1996");
	
		Campaign campaign =new Campaign();
		campaign.setName("2 al 1 öde");   
               
        GamerManager customerManager = new GamerManager(new MernisServiceAdapter());
        customerManager.add(gamer);
        customerManager.delete(gamer);
        
        ComputerGameManager productManager = new ComputerGameManager();
 		productManager.sales(gamer,computerGame, campaign);
 		productManager.cancel(gamer,computerGame) ;
	}

}
