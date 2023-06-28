package com.seleniumexpress.lc.api;

public class UserInfoDTO {
private String username ;
private String crushname;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCrushname() {
	return crushname;
}
public void setCrushname(String crushname) {
	this.crushname = crushname;
}
@Override
public String toString() {
	return "UserInfoDTO [username=" + username + ", crushname=" +crushname + "]";
}
	
}
