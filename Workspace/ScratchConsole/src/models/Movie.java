package models;

public class Movie {

	private String title = "[Unknown]";
	private int year = 1849;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {

		if (title == null || title.trim().isEmpty()) {
			title = "[Unknown]";
		}
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		// Return a String in the format: Title (Year) - Rating
		String retVal = getTitle() + " (" + getYear() + ") - " + "PG13";

		return retVal;
	}
}
