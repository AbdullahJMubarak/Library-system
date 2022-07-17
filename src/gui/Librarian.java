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


public class Librarian extends Person{
	private String email;
	private String address;
	private String City;
	private String ContactNo;
	 
        FileWriter fw;
	private String ID;

    
        public String getID() {
		return ID;
	}
        public void setID(String iD) {
		ID = iD;
	}
	public Librarian(String ID,String name, String password, String email, String address, String city,String contactNo) {
		super(name, password);
		this.email = email;
		this.address = address;
		City = city;
		ContactNo = contactNo;
                this.ID=ID;
	}

    public  Librarian() {
       super();
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
	}public void addLibrarian(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws IOException{
         
           
            fw=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Librarians.txt"),true);
      fw.write(s1+" ");
    fw.write(s2+" ");
    fw.write(s3+" ");
  
    fw.write(s4+" ");
    fw.write(s5+" ");
    fw.write(s6+" ");
    fw.write(s7+"\n");
        fw.close();
        JOptionPane.showMessageDialog(null, " Librarian  added");
       
        
        
        }
	
}
