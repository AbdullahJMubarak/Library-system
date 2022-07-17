/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Ahmed gamal
 */
public class IssueComp {
private String CallNo; 
private String ID; 
private String Name; 
private String ContactNo; 
private int day;
private int month;
public IssueComp(String callNo, String iD, String name, String contactNo, int day, int month, int year) {

	CallNo = callNo;
	ID = iD;
	Name = name;
	ContactNo = contactNo;
	this.day = day;
	this.month = month;
	this.year = year;
}
private int year;
public String getCallNo() {
	return CallNo;
}
public void setCallNo(String callNo) {
	CallNo = callNo;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getContactNo() {
	return ContactNo;
}
public void setContactNo(String contactNo) {
	ContactNo = contactNo;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
