package com.seleniumexpress.lc.api;

public class registerinfoDTO {
	
	private String name ;
	private String username ;
	private char [] pwd ;
	private String country ;
	private String [] hobby ;
	private String gender ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		
		this.username = username;
		System.out.println(username);
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public char[] getPwd() {
		return pwd;
	}
	public void setPwd(char[] pwd) {
		this.pwd = pwd;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "registerinfoDTO [name=" + name + ", username=" + username + ", pwd=" + pwd + ", country=" + country
				+ ", hobby=" + hobby + ", gender=" + gender + "]";
	}
	
	
	
	

}
