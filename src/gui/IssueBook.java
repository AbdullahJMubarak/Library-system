/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed gamal
 */
public class IssueBook extends javax.swing.JFrame {
int i=0,count=0;
int iS=0,countS=0;
boolean flagb,flags;
FileWriter fw,fw1,fw3;
   Validity v;
   Scanner x;
   Scanner x1;
    Student []student;
    Book1[] book;
    int tempb=0,temps=0;
    public IssueBook() {
        this.setLocation(370, 170);
        initComponents();
       
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TCallNo = new javax.swing.JTextField();
        TStudentID = new javax.swing.JTextField();
        TStudentName = new javax.swing.JTextField();
        TStudentContact = new javax.swing.JTextField();
        BIssue = new javax.swing.JButton();
        BBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Issued Book");

        jLabel2.setText("Book Callno:");

        jLabel3.setText("Student ID:");

        jLabel4.setText("Student Name:");

        jLabel5.setText("Student Contact:");

        BIssue.setText("Issue Book");
        BIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIssueActionPerformed(evt);
            }
        });

        BBack.setText("Back");
        BBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TCallNo)
                            .addComponent(TStudentID)
                            .addComponent(TStudentName)
                            .addComponent(TStudentContact, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(BIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TCallNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addComponent(TStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIssueActionPerformed
      
    
        try {
        x=new Scanner(new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Books.txt"));
         } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, " File Error!");
       
        } 
         
book =new Book1[100];
while(x.hasNext()){
      book[i] =new Book1(x.next(),x.next(),x.next(),x.next(),Integer.parseInt(x.next()),Integer.parseInt(x.next()),Integer.parseInt(x.next()),Integer.parseInt(x.next()),Integer.parseInt(x.next()));
         
       
      ++i;
        count++;}
      
      x.close();
      try {
      x1=new Scanner(new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Students.txt"));
      } catch (FileNotFoundException e) {
      JOptionPane.showMessageDialog(null, " File Error!");
      }
      i=0;
     student=new Student[100];
      while(x1.hasNext()){
      student[i] =new Student(x1.next(),x1.next(),x1.next(),x1.next(),x1.next(),x1.next(),x1.next(),Integer.parseInt(x1.next()));
      
      
      ++i;
      countS++;}
      
      x1.close();
      flagb=false;flags=false;
      for(i=0;i<count;++i){
      if(TCallNo.getText().equals(book[i].getCallNo())){
      flagb=true;
      tempb=i;}
      }
      for(int j=0;j<countS;++j){
      if(student[j].getName().equals(TStudentName.getText())&&student[j].getID().equals(TStudentID.getText())&&student[j].getContactNo().equals(TStudentContact.getText()))
      { flags=true;
      temps=j;}
      }
      if(flagb&&flags){
          
      if(student[temps].getNoOfissued()<3)
      {  
      JOptionPane.showMessageDialog(null, " issued sucessfully");
       JOptionPane.showMessageDialog(null,book[tempb].getCallNo() );
       student[temps].setNoOfissued(student[temps].getNoOfissued()+1);
       JOptionPane.showMessageDialog(null,student[temps].getNoOfissued() );
      book[tempb].increaseIssueNO();
      JOptionPane.showMessageDialog(null,book[tempb].getIssueNo() );
          try {
              book[tempb].addIssuedBook(book[tempb].getCallNo(),student[temps].getID(),student[temps].getName(),student[temps].getContactNo());
          } catch (IOException ex) {
              Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      else{
      
      JOptionPane.showMessageDialog(null, " the student already borrowed 3 books and can't borrow more");
      }}
      else if(flagb){
      
      JOptionPane.showMessageDialog(null, " Student isn't exist");
      
      }else if(flags){
      JOptionPane.showMessageDialog(null, " Book isn't exist");
      }else{
      
      JOptionPane.showMessageDialog(null, " neither student nor book is exist");
      
      }
       try{
     
      fw3=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Books.txt"));
       for(i=0;i<count;++i){
           fw3.write(book[i].getCallNo()+" ");
      fw3.write(book[i].getName()+" ");
      fw3.write(book[i].getAuthor()+" ");
      
      fw3.write(book[i].getPublisher()+" ");
      
      fw3.write(book[i].getQuantity()+" ");
      fw3.write(book[i].getIssuedNo()+" ");
      fw3.write(book[i].getDay()+" ");
      fw3.write(book[i].getMonth()+" ");
      fw3.write(book[i].getYear()+"\n");
      }
      } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, " error opening file");}
    try {
        fw3.close();
          try{ fw=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Students.txt"));
        for(i=0;i<countS;++i){
        
        
         fw.write(student[i].getID()+" ");
         fw.write(student[i].getName()+" ");
        fw.write(student[i].getPassword()+" ");
        fw.write(student[i].getEmail()+" ");
        
        fw.write(student[i].getAddress()+" ");
        fw.write(student[i].getCity()+" ");
        fw.write(student[i].getContactNo()+" ");
        
        fw.write(student[i].getNoOfissued()+"\n");
        } fw.close();} catch (IOException ex) {
        JOptionPane.showMessageDialog(null, " error opening file");}
      /*  /*try{         fw1=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Issues.txt"),true);
        fw1.write(book[tempb].getCallNo()+" ");
        fw1.write(book[tempb].getName()+" ");
        fw1.write(book[tempb].getAuthor()+" ");
        
        fw1.write(book[tempb].getPublisher()+" ");
        
        fw1.write(book[tempb].getQuantity()+" ");
        fw1.write(book[tempb].getIssuedNo()+" ");
        Date thisDate =new Date();
        SimpleDateFormat dformat= new SimpleDateFormat("dd MM yyyy");
        String date =dformat.format(thisDate);
        fw1.write(date+"\n");
        fw1.close();
        
        fw.close();} catch (IOException ex) {
        JOptionPane.showMessageDialog(null, " error opening file");}
        
        
        
        */
    } catch (IOException ex) {
        Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
    }
    
      this.setVisible(false);
        LibrarianSection ls=new LibrarianSection();
       
        ls.setVisible(true);  
    }//GEN-LAST:event_BIssueActionPerformed

    private void BBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBackActionPerformed
        this.setVisible(false);
        LibrarianSection ls=new LibrarianSection();
       
        ls.setVisible(true);
    }//GEN-LAST:event_BBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BIssue;
    private javax.swing.JTextField TCallNo;
    private javax.swing.JTextField TStudentContact;
    private javax.swing.JTextField TStudentID;
    private javax.swing.JTextField TStudentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
