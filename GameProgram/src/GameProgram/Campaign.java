package GameProgram;

public class Campaign {
	String name;
	int percent;
	
	public Campaign() {
		
	}

	public Campaign(String name, int percent) {
		super();
		this.name = name;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}
	
	

}
