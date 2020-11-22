package factory.method.builder;

/**
 * This is the simple User class used in several
 * of the examples. It has public final fields
 * instead of getters for brevity.
 */
public class User {
    //public final String email, username, firstName, lastName, displayName;

	private String username;
	private String email;
	private String team;
	private String country;
	
	public User(String username, String email, String team, String country) {
		this.username = username;
		this.email = email;
		this.team = team;
		this.country = country;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", team=" + team + ", country=" + country + "]";
	}
}
