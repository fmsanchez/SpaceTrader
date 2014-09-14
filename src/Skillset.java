import org.json.JSONObject;

public class Skillset implements Savable {

	private int piloting;
	private int navigation;
	private int engineering;
	private int charisma;

	public int getPiloting() {
		return piloting;
	}

	public void setPiloting(int piloting) {
		this.piloting = piloting;
	}

	public int getNavigation() {
		return navigation;
	}

	public void setNavigation(int navigation) {
		this.navigation = navigation;
	}

	public int getEngineering() {
		return engineering;
	}

	public void setEngineering(int engineering) {
		this.engineering = engineering;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	// TODO with JSON
	public String save() {
		return "skillset";
	}

}
