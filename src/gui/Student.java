/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Student extends Person {
	private String email;
	private String address;
	private String City;
	private String ContactNo;
        private String b1;
          private String b2;
          private String b3;
          private int issuedNo;	
         FileWriter fw;
        private String ID;
         private int NoOfissued;
         int getIssueNo(){
        return issuedNo;
        }
        void increaseIssueNO(){
        ++issuedNo;
        }
        void decreaseIssueNO(){
        --issuedNo;
        }
        public void setB1(String b){
        
        this.b1=b;
        }
        public String getB1(){
        
        return this.b1;
        }
         public void setB3(String b){
        
        this.b3=b;
        }
        public String getB3(){
        
        return this.b3;
        }
         public void setB2(String b){
        
        this.b2=b;
        }
        public String getB2(){
        
        return this.b2;
        }

public int getNoOfissued() {
		return NoOfissued;
	}
        public void setNoOfissued(int NoOfissued) {
		this.NoOfissued=NoOfissued;
	}
public void incrementNoOfissued() {
	this.NoOfissued++; 
} 
public void decrementBooks() {
	 NoOfissued--; 
}
        public String getID() {
		return ID;
	}
        public void setID(String iD) {
		ID = iD;
	}
         public Student(){
super();
}
	public Student(String ID,String name, String password,  String email, String address, String city, String contactNo,int NoOfissued) {
		super(name, password);
		this.email = email;
		this.address = address;
		City = city;
		ContactNo = contactNo;
                this.ID=ID;
                this.NoOfissued=NoOfissued;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public void addStudent(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws IOException{
         
           
            fw=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Students.txt"),true);
      fw.write(s1+" ");
    fw.write(s2+" ");
    fw.write(s3+" ");
  
    fw.write(s4+" ");
    fw.write(s5+" ");
    fw.write(s6+" ");
    fw.write(s7+" ");
    fw.write("0"+"\n");
        fw.close();
        JOptionPane.showMessageDialog(null, " Student added");
       
        
        
        }
        /* public void addBook(Book book1){
        int i;
        for(i=0;i<3;++i)
        {if(book[i]==null)
        { book[i]=book1;
        JOptionPane.showMessageDialog(null, "book issued sucessfully");
        return;
        }}
        
        JOptionPane.showMessageDialog(null, "student aleardy borrowed 3 books");
        }*/

   
        

}