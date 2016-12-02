package com.mjacobo.builder;

public class TestUserBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User.UserBuilder("Marco", "Jacobo").age(28)
						.address("Diplomaticos 7").phone("5563340191")
						.build();
		
		System.out.println(user.toString());
		
	}

}
