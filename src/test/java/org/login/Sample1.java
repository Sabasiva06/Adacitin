package org.login;

public class Sample1 {

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.equals("facebook")) {
			this.username = "Java123";
		} else if (username.equals("insta")) {
			this.username = "carzyJavaa";
		} else if (username.equals("twitter")) {
			this.username = "hastagJava";

		} else {
			System.out.println("ENter correct username");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.equals("facebook")) {
			this.password = "Java@12324";
		} else if (password.equals("insta")) {
			this.password = "carzy_Javaa";
		} else if (password.equals("twitter")) {
			this.password = "Java!234";

		} else {
			System.out.println("ENter correct Password");
		}

	}

}
