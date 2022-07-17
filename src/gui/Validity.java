/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


public class Validity {

public boolean vName(String s){


return !containsDigit(s);
}


    public boolean vCity(String s){
   return !containsDigit(s);
    }
   
 public boolean vContact(String s){
     char ch[]=s.toCharArray();
if(!containsChar(s)&&s.length()==11&&ch[0]=='0'&&ch[1]=='1')
    return true;

return false;
 }    
    public boolean vEmail(String s){
   int count=0;

            if (containsChar(s) ) 
                count++;
   
           if(s.contains("@"))
               count++;
           if(s.contains(".com"))
               count++;

       if(s.length()>10)
           count++;
       char ch[]=s.toCharArray();
   if('@'!=ch[0])
       count++;
   
    return count ==5;
    }
    
    
    public  boolean containsChar(String s) {
    boolean containsChar = false;

    if (s != null && !s.isEmpty()) {
        for (char c : s.toCharArray()) {
            if (containsChar = Character.isLetter(c)) {
                containsChar=true;
                break;
            }
        }
    }

    return containsChar;
}
    
    
    public boolean vPassword(String s){
   int count=0;
  
            if (containsChar(s) ) 
                count++;
   
           
    for (char c : s.toCharArray()){ 
   if(c>=65 && c<=90){
   count++;
   break;}
    }   
   for (char c : s.toCharArray()){
   if(c>=97 && c<=122){
   count++;
  
   break;}}

       if(s.length()>10)
           count++;
       
   if(containsDigit(s))
       count++;
    return count ==5;
    }
    
    
    
    
    public boolean vID(String ID){
        if (ID == null) {
        return false;
    }
    try {
        int i = Integer.parseInt(ID);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    public  boolean containsDigit(String s) {
    boolean containsDigit = false;

    if (s != null && !s.isEmpty()) {
        for (char c : s.toCharArray()) {
            if (containsDigit = Character.isDigit(c)) {
                containsDigit=true;
                break;
            }
        }
    }

    return containsDigit;
}
    }

