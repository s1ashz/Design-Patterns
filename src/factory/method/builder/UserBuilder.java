package factory.method.builder;

public class UserBuilder {
	
	private String username;
	private String email;
	private String team;
	private String country;

	public static UserBuilder createUser() {
		return new UserBuilder();
	}
	
	public UserBuilder username(String username) {
		this.username = username;
		return this;
	}
	
	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public UserBuilder team(String team) {
		this.team = team;
		return this;
	}
	
	public UserBuilder country(String country) {
		this.country = country;
		return this;
	}
	
	public User build() {
		return new User(username, email, team, country);
	}
	
//    public static UserBuilder user() {
//        return new UserBuilder();
//    }
//
//    private String email, username, firstName, lastName, displayName;
//
//    public UserBuilder email(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public UserBuilder username(String username) {
//        this.username = username;
//        return this;
//    }
//
//    public UserBuilder firstName(String firstName) {
//        this.firstName = firstName;
//        return this;
//    }
//
//    public UserBuilder lastName(String lastName) {
//        this.lastName = lastName;
//        return this;
//    }
//
//    public UserBuilder displayName(String displayName) {
//        this.displayName = displayName;
//        return this;
//    }
//
//    public User build() {
//        return new User(email, username, firstName, lastName, displayName);
//    }
}
