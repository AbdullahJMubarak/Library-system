/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Book {



private String callNo;
		private String name;

	private String author;
	private String publisher;
	private int quantity;
	private int issuedNo;
        private int day;
	private int month;
	private int year;
        public Book(){}
	public Book(String callNo, String name, String author, String publisher, int quantity, int issuedNo, int day,int month, int year) {
		
		this.callNo = callNo;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.issuedNo = issuedNo;
		this.day = day;
		this.month = month;
		this.year = year;
	}
        void increaseIssueNO(){
        ++issuedNo;
        }
        void decreaseIssueNO(){
        --issuedNo;
        }
	public String getCallNo() {
		return callNo;
	}
	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getIssuedNo() {
		return issuedNo;
	}
	public void setIssuedNo(int issuedNo) {
		this.issuedNo = issuedNo;
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
	


public void addBook(String s1,String s2,String s3,String s4,String s5,String s6) throws IOException{
       Date thisDate =new Date();
    SimpleDateFormat dformat= new SimpleDateFormat("dd MM yyyy");
         String date =dformat.format(thisDate);
           
    FileWriter fw = new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Books.txt"),true);
      fw.write(s1+" ");
    fw.write(s2+" ");
    fw.write(s3+" ");
  
    fw.write(s4+" ");
  
    fw.write(s5+" ");
    fw.write(s6+" ");
    fw.write(date+"\n");
   
        fw.close();
        JOptionPane.showMessageDialog(null, " Book added");
       
        
        
        }

}
