package GameProgram;

public class ComputerGameManager implements IGameSales {
	
	@Override
	public void sales(Gamer gamer, ComputerGame computerGame, Campaign campaign) {
		System.out.println( "Sat�lan oyun bilgileri:" + 
	"oyunu sat�n alan oyuncunun kullan�c� ad�: "+ gamer.getNickname() + ","  + 
				"sat�n al�nan bilgisayar oyununun ad�:" + computerGame.getName() + " , " +
	"hangi kampanyadan yararlan�ld�:" + campaign.getName() );
		
	}

	@Override
	public void cancel(Gamer gamer, ComputerGame computerGame) {
		
		System.out.println( "iptal edilen  oyun bilgileri:" + 
				"oyunu iptal eden  oyuncunun kullan�c� ad�: "+ gamer.getNickname() + ","  + 
							"iptal edilen  bilgisayar oyununun ad�:" + computerGame.getName()  );
					
	}


}
