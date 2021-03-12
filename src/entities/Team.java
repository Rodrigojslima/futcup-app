package entities;

public class Team implements Comparable<Team> {
	
	private String name;
	private int id;
	private int score;
	private int victories;
	private int defeats;
	private int ties;
	private int positiveGoals;
	private int negativeGoals;
	private int matches;

	public Team(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGoalDifference() {
		return positiveGoals - negativeGoals;
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}
	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	public int getPositiveGoals() {
		return positiveGoals;
	}

	public void setPositiveGoals(int positiveGoals) {
		this.positiveGoals = positiveGoals;
	}

	public int getNegativeGoals() {
		return negativeGoals;
	}

	public void setNegativeGoals(int negativeGoals) {
		this.negativeGoals = negativeGoals;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getTies() {
		return ties;
	}
	
	public void setTies(int ties) {
		this.ties = ties;
	}
	
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
