package factory.method.builder;


public class Main {
	
	public static void main(String[] args) {
		
		User newUser = new UserBuilder()
				.username("s1ashz")
				.email("asd.com")
				.team("razor")
				.build();
		
		
		System.out.println(newUser.toString());
		newUser.setUsername("s1z");
		newUser.setCountry("leetland");
		System.out.println(newUser.toString());

	}
	
	
	
	
	/*
	
    public void user_builder_usage() {
        User user = new UserBuilder()
                .email("joey@example.com")
                .username("john_smith")
                .firstName("John")
                .lastName("Smith")
                .displayName("joey")
                .build();

    }
    */
}
