package io.github.vamandeshmukh.spring.mvc.model;

public class Employee {
	private String userName;
	private String password;

	public Employee() {
		super();
	}

	public Employee(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", password=" + password + "]";
	}

}
