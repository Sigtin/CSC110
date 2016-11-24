package models;

public class ZombieDicePlayer {
	
	private String playerName;
	private int brains;
	private int blasts;
	private int score;
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBrains() {
		return brains;
	}

	public void incrementBrains() {
		this.brains++;
	}

	public int getBlasts() {
		return blasts;
	}

	public void incrementBlasts() {
		this.blasts++;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		String retVal = getPlayerName() + "\n" + "Brains Eaten: " + getScore();
		
		return retVal;
	}

}