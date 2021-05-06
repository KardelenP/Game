package GameProgram;

public class Gamer {
	int id;
	String nickname;
	String dateOfBirthdate;
	
	public Gamer() {
		
	}

	public Gamer(int id, String nickname, String dateOfBirthdate) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.dateOfBirthdate = dateOfBirthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDateOfBirthdate() {
		return dateOfBirthdate;
	}

	public void setDateOfBirthdate(String dateOfBirthdate) {
		this.dateOfBirthdate = dateOfBirthdate;
	}
	
	
	
	

}
