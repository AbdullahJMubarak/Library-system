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
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DeleteLibrarian extends javax.swing.JFrame {
FileWriter fw;
      Scanner x;  
    int i=0,count=0;
    boolean flag =false;
    Validity v;
    public DeleteLibrarian() throws IOException {
        initComponents();
        this.setLocation(370, 170);
       

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BDelete = new javax.swing.JButton();
        TID = new javax.swing.JTextField();
        BBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BDelete.setText("Delete");
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });

        TID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDActionPerformed(evt);
            }
        });

        BBack.setText("Back");
        BBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIDActionPerformed

    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        // TODO add your handling code here:
        v=new Validity();
     if(!v.vID(TID.getText())){
     JOptionPane.showMessageDialog(null, " Enter a valid ID");
     } else{
        try {
        x=new Scanner(new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Librarians.txt"));
        } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, " File Error!");
        } 
            Librarian[] librarian=new Librarian[100];
        while(x.hasNext()){
       librarian[i] =new Librarian(x.next(),x.next(),x.next(),x.next(),x.next(),x.next(),x.next());
         
       
      ++i;
        count++;}
        x.close();
        try{
         fw=new FileWriter( new File("C:\\Users\\Ahmed gamal\\Documents\\NetBeansProjects\\Gui\\src\\gui\\Librarians.txt"));
        i=0;
        for(i=0;i<count;++i){
         if(librarian[i].getID().equals(TID.getText()))
         { flag=true;

        continue;
         }
    fw.write(librarian[i].getID()+" ");
    fw.write(librarian[i].getName()+" ");
    fw.write(librarian[i].getPassword()+" ");
  
    fw.write(librarian[i].getEmail()+" ");
    fw.write(librarian[i].getAddress()+" ");
    fw.write(librarian[i].getCity()+" ");
    fw.write(librarian[i].getContactNo()+"\n");
    
   }
   fw.close();     }
        catch(IOException e){
            System.out.println("error opening file");
        }
        if(flag){
        JOptionPane.showMessageDialog(null, " librarian deleteted");
        
         this.setVisible(false);
        AdminSection a=new AdminSection();
        a.setVisible(true);
        } else{
         JOptionPane.showMessageDialog(null, " librarian is not existing in the list");
          this.setVisible(false);
        AdminSection a=new AdminSection();
        a.setVisible(true);
        }}
   
    }//GEN-LAST:event_BDeleteActionPerformed

    private void BBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminSection a=new AdminSection();
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeleteLibrarian().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, " librarian deleteted");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BDelete;
    private javax.swing.JTextField TID;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
