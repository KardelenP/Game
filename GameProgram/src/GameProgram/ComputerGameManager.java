package GameProgram;

public class ComputerGameManager implements IGameSales {
	
	@Override
	public void sales(Gamer gamer, ComputerGame computerGame, Campaign campaign) {
		System.out.println( "Satýlan oyun bilgileri:" + 
	"oyunu satýn alan oyuncunun kullanýcý adý: "+ gamer.getNickname() + ","  + 
				"satýn alýnan bilgisayar oyununun adý:" + computerGame.getName() + " , " +
	"hangi kampanyadan yararlanýldý:" + campaign.getName() );
		
	}

	@Override
	public void cancel(Gamer gamer, ComputerGame computerGame) {
		
		System.out.println( "iptal edilen  oyun bilgileri:" + 
				"oyunu iptal eden  oyuncunun kullanýcý adý: "+ gamer.getNickname() + ","  + 
							"iptal edilen  bilgisayar oyununun adý:" + computerGame.getName()  );
					
	}


}
