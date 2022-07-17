/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

public class Admin {
private String Name;
private String Password;

public Admin(String name, String passWord) {
	
	Name = name;
	Password = passWord;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPassword() {
	return Password;
}
public void setPassword(String passWord) {
	Password = passWord;
}

}